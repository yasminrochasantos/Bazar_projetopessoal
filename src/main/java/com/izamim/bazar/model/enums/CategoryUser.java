package com.izamim.bazar.model.enums;

public enum CategoryUser {
	
	CLIENT(1),
	SELLER(2);
	
	private int category;
	
	private CategoryUser(int category) {
		this.category = category;
	}
	
	public int getCategory() {
		return category;
	}

	
	public static CategoryUser valueOf(int category) {
		for (CategoryUser value : CategoryUser.values()) {
			if(value.getCategory() == category) {
				return value;
			}
		}
		throw new IllegalArgumentException("invalid OrderStatus code");
	}

}
