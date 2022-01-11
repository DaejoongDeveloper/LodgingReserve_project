package com.reserve.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.reserve.mapper.AttachMapper;
import com.reserve.mapper.CartMapper;
import com.reserve.mapper.LodgingMapper;
import com.reserve.mapper.MemberMapper;
import com.reserve.mapper.ReserveMapper;
import com.reserve.model.AttachImageVO;
import com.reserve.model.CartDTO;
import com.reserve.model.LodgingVO;
import com.reserve.model.MemberVO;
import com.reserve.model.ReserveCancelDTO;
import com.reserve.model.ReserveDTO;
import com.reserve.model.ReserveLodgingDTO;
import com.reserve.model.ReservePageLodgingDTO;

@Service
public class ReserveServiceImpl implements ReserveService{
	
	@Autowired
	private ReserveMapper reserveMapper;
	
	@Autowired
	private AttachMapper attachMapper;
	
	@Autowired
	private MemberMapper memberMapper;
	
	@Autowired
	private CartMapper cartMapper;
	
	@Autowired
	private LodgingMapper lodgingMapper;
	
	
	@Override
	public List<ReservePageLodgingDTO> getLodgingInfo(List<ReservePageLodgingDTO> reserves){
		List<ReservePageLodgingDTO> result = new ArrayList<ReservePageLodgingDTO>();		
		
		for(ReservePageLodgingDTO rrd : reserves) {
			
			ReservePageLodgingDTO lodgingInfo = reserveMapper.getLodgingInfo(rrd.getLodgingId());			

			lodgingInfo.setLodgingCount(rrd.getLodgingCount());	
			
			lodgingInfo.initTotal();	
			
			List<AttachImageVO> imageList = attachMapper.getAttachList(lodgingInfo.getLodgingId());
			
			lodgingInfo.setImageList(imageList);
			
			result.add(lodgingInfo);			
		}		
		
		return result;
	}
	
	@Override
	@Transactional
	public void reserve(ReserveDTO rrd) {
		// 회원 정보 
		MemberVO member = memberMapper.getMemberInfo(rrd.getMemberId());
		// 주문 정보 
		List<ReserveLodgingDTO> rrds = new ArrayList<>();
		for(ReserveLodgingDTO rld : rrd.getReserves()) {
			ReserveLodgingDTO reserveLodging = reserveMapper.getReserveInfo(rld.getLodgingId());
			
			// 수량 세팅
			reserveLodging.setLodgingCount(rld.getLodgingCount());
			// 기본정보 세팅
			reserveLodging.initTotal();
			// List객체 추가
			rrds.add(reserveLodging);
		}
		// ReserveDTO 세팅
		rrd.setReserves(rrds);
		rrd.getReservePriceInfo();
		
		Date date = new Date();
		SimpleDateFormat format = new SimpleDateFormat("_yyyyMMddmm");
		String reserveId = member.getMemberId() + format.format(date);
		rrd.setReserveId(reserveId);
		
		// db넣기 
		reserveMapper.enrollReserve(rrd);		
		for(ReserveLodgingDTO rld : rrd.getReserves()) {		
			rld.setReserveId(reserveId);
			reserveMapper.enrollReserveLodging(rld);			
		}
		
		// 재고 변동 적용
		for(ReserveLodgingDTO rld : rrd.getReserves()) {
			// 변동 재고 값 구하기
			LodgingVO lodging = lodgingMapper.getLodgingInfo(rld.getLodgingId());
			lodging.setLodgingStock(lodging.getLodgingStock() - rld.getLodgingCount());
			// 변동 값 DB 적용 
			reserveMapper.deductStock(lodging);
		}
		
		// 장바구니 제거
		for(ReserveLodgingDTO rld : rrd.getReserves()) {
			CartDTO dto = new CartDTO();
			dto.setMemberId(rrd.getMemberId());
			dto.setLodgingId(rld.getLodgingId());
			
			cartMapper.deleteReserveCart(dto);
		}
		
	}
	
	@Override
	@Transactional
	public void reserveCancel(ReserveCancelDTO dto) {
		
		//회원
		MemberVO member = memberMapper.getMemberInfo(dto.getMemberId());
		
		// 예약상품
		List<ReserveLodgingDTO> rrds = reserveMapper.getReserveLodgingInfo(dto.getReserveId());
		for(ReserveLodgingDTO rld : rrds) {
			rld.initTotal();
		}
		
		// 예약
		ReserveDTO rrw = reserveMapper.getReserve(dto.getReserveId());
		rrw.setReserves(rrds);
		
		rrw.getReservePriceInfo();
		
		// 예약상품 취소 DB 
		reserveMapper.reserveCancle(dto.getReserveId());
			
		// 재고 
		for(ReserveLodgingDTO rld : rrw.getReserves()) {
			LodgingVO lodging = lodgingMapper.getLodgingInfo(rld.getLodgingId());
			lodging.setLodgingStock(lodging.getLodgingStock() + rld.getLodgingCount());
			reserveMapper.deductStock(lodging);
		}
		
	}
}
