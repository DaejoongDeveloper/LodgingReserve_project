package com.reserve.mapper;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.reserve.model.CartDTO;
import com.reserve.model.LodgingVO;
import com.reserve.model.MemberVO;
import com.reserve.model.ReserveDTO;
import com.reserve.model.ReserveLodgingDTO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class ReserveMapperTest {
	
	@Autowired
	private ReserveMapper mapper;
	
//	@Test
//	public void getReserveInfoTest() {
//		
//		 ReserveLodgingDTO reserveInfo = mapper.getReserveInfo(29);
//		 
//		 System.out.println("result : " + reserveInfo);
//	}
	
//	@Test
//	public void enrollReserveTest() {
//		
//		ReserveDTO rrd = new ReserveDTO();
//		List<ReserveLodgingDTO> reserves = new ArrayList();
//		
//		ReserveLodgingDTO reserve1 = new ReserveLodgingDTO();
//		
//		reserve1.setLodgingId(29);
//		reserve1.setLodgingCount(10);
//		reserve1.setLodgingPrice(10000);
//		reserve1.initTotal();
//		
//		
//		
//		rrd.setReserves(reserves);
//		
//		rrd.setReserveId("2024_test");
//		rrd.setReserveName("test");
//		rrd.setMemberId("admin1");
//		rrd.setReserveState("예약준비");
//		
//		mapper.enrollReserve(rrd);		
//		
//	}
//	
//	@Test
//	public void enrollReserveLodgingTest() {
//		
//		ReserveLodgingDTO rld = new ReserveLodgingDTO();
//		
//		
//		rld.setReserveId("2024_test");
//		rld.setLodgingId(29);
//		rld.setLodgingCount(10);
//		rld.setLodgingPrice(10000);
//				
//		rld.initTotal();
//		
//		mapper.enrollReserveLodging(rld);
//		
//	}	
	
//	
//	@Test
//	public void deductStockTest() {
//		LodgingVO lodging = new LodgingVO();
//		
//		lodging.setLodgingId(29);
//		lodging.setLodgingStock(15);
//		
//		mapper.deductStock(lodging);
//	}
	
//	@Test
//	public void deleteReserveCart() {
//		String memberId = "abc123";
//		int lodgingId = 23;
//		
//		CartDTO dto = new CartDTO();
//		dto.setMemberId(memberId);
//		dto.setLodgingId(lodgingId);
//		
//		mapper.deleteReserveCart(dto);
//		
//	}
}
