package com.reserve.model;

public class ReserveLodgingDTO {
	
	private String reserveId;
	
	private int lodgingId;
	
	private int lodgingCount;
	
	private int reserveLodgingId;
	
	private int lodgingPrice;
	
	private int totalPrice;

	public String getReserveId() {
		return reserveId;
	}

	public void setReserveId(String reserveId) {
		this.reserveId = reserveId;
	}

	public int getLodgingId() {
		return lodgingId;
	}

	public void setLodgingId(int lodgingId) {
		this.lodgingId = lodgingId;
	}

	public int getLodgingCount() {
		return lodgingCount;
	}

	public void setLodgingCount(int lodgingCount) {
		this.lodgingCount = lodgingCount;
	}

	public int getReserveLodgingId() {
		return reserveLodgingId;
	}

	public void setReserveLodgingId(int reserveLodgingId) {
		this.reserveLodgingId = reserveLodgingId;
	}

	public int getLodgingPrice() {
		return lodgingPrice;
	}

	public void setLodgingPrice(int lodgingPrice) {
		this.lodgingPrice = lodgingPrice;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	public void initTotal() {
		this.totalPrice = this.lodgingPrice*this.lodgingCount;
		
	}

	@Override
	public String toString() {
		return "ReserveLodgingDTO [reserveId=" + reserveId + ", lodgingId=" + lodgingId + ", lodgingCount="
				+ lodgingCount + ", reserveLodgingId=" + reserveLodgingId + ", lodgingPrice=" + lodgingPrice
				+ ", totalPrice=" + totalPrice + "]";
	}
	
	
	
}
