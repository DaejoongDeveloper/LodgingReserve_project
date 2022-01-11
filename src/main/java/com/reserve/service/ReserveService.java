package com.reserve.service;

import java.util.List;

import com.reserve.model.ReserveCancelDTO;
import com.reserve.model.ReserveDTO;
import com.reserve.model.ReservePageLodgingDTO;

public interface ReserveService {
	// 예약 정보
	public List<ReservePageLodgingDTO> getLodgingInfo(List<ReservePageLodgingDTO> reserves);
	
	// 예약
	public void reserve(ReserveDTO rrw);
	
	// 예약 취소
	public void reserveCancel(ReserveCancelDTO dto);
}
