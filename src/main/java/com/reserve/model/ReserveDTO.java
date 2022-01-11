package com.reserve.model;

import java.util.Date;
import java.util.List;

public class ReserveDTO {
	
	private String reserveId;
	
	private String reserveName;
	
	private String memberId;
	
	private String reserveState;
	
	private List<ReserveLodgingDTO> reserves;
	
	private Date reserveDate;
	
	private int reserveFinalPrice;

	public String getReserveId() {
		return reserveId;
	}

	public void setReserveId(String reserveId) {
		this.reserveId = reserveId;
	}

	public String getReserveName() {
		return reserveName;
	}

	public void setReserveName(String reserveName) {
		this.reserveName = reserveName;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getReserveState() {
		return reserveState;
	}

	public void setReserveState(String reserveState) {
		this.reserveState = reserveState;
	}

	public List<ReserveLodgingDTO> getReserves() {
		return reserves;
	}

	public void setReserves(List<ReserveLodgingDTO> reserves) {
		this.reserves = reserves;
	}

	public Date getReserveDate() {
		return reserveDate;
	}

	public void setReserveDate(Date reserveDate) {
		this.reserveDate = reserveDate;
	}

	public int getReserveFinalPrice() {
		return reserveFinalPrice;
	}

	public void setReserveFinalPrice(int reserveFinalPrice) {
		this.reserveFinalPrice = reserveFinalPrice;
	}

	@Override
	public String toString() {
		return "ReserveDTO [reserveId=" + reserveId + ", reserveName=" + reserveName + ", memberId=" + memberId
				+ ", reserveState=" + reserveState + ", reserves=" + reserves + ", reserveDate=" + reserveDate
				+ ", reserveFinalPrice=" + reserveFinalPrice + "]";
	}
	
	public void getReservePriceInfo() {
		reserveFinalPrice = reserveFinalPrice;
	}

	
}
