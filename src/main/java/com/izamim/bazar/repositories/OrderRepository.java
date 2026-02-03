package com.izamim.bazar.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.izamim.bazar.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
