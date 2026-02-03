package com.izamim.bazar.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.izamim.bazar.model.Order;
import com.izamim.bazar.repositories.OrderRepository;
import com.izamim.bazar.service.exception.ResourceNotFound;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository repository;
	
	public List<Order> findAll(){
		return repository.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> o = repository.findById(id);
		return  o.orElseThrow(() -> new ResourceNotFound(id));
	}

}
