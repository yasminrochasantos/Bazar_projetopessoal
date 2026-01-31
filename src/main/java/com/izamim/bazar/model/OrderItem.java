package com.izamim.bazar.model;

import java.util.Objects;

import com.izamim.bazar.model.orderPk.OrderItemPk;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "orderItem_tb")
public class OrderItem {
	
	@EmbeddedId
	private OrderItemPk id = new OrderItemPk();
	
	private Integer quantity;
	private Double price;
	
	public OrderItem() {
		
	}

	public OrderItem(OrderItemPk id, Integer quantity, Double price) {
		super();
		this.id = id;
		this.quantity = quantity;
		this.price = price;
	}

	public OrderItemPk getId() {
		return id;
	}

	public void setId(OrderItemPk id) {
		this.id = id;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderItem other = (OrderItem) obj;
		return Objects.equals(id, other.id);
	}
	
	

}
