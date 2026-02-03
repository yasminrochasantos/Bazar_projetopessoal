package com.izamim.bazar.model.enums;

public enum OrderStatus {

	CONFIRMED(1),
	PROGRESS(2),
	CANCELED(3);
	
	private int status;
	
	private OrderStatus(int status) {
		this.status = status;
	}
	
	public int getStatus() {
		return status;
	}

	
	public static OrderStatus valueOf(int status) {
		for (OrderStatus value : OrderStatus.values()) {
			if(value.getStatus() == status) {
				return value;
			}
		}
		throw new IllegalArgumentException("invalid OrderStatus code");
	}

}
