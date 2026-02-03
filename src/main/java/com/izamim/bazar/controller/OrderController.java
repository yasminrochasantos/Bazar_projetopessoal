package com.izamim.bazar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.izamim.bazar.model.Order;
import com.izamim.bazar.service.OrderService;

@RestController
@RequestMapping(value = "/orders")
public class OrderController {
	
	@Autowired
	private OrderService service;
	
	@GetMapping
	public ResponseEntity<List<Order>> findAll(){
		List<Order> o = service.findAll();
		return ResponseEntity.ok().body(o);
	}
	
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Order> FindById(@PathVariable Long id){
		Order o = service.findById(id);
		return ResponseEntity.ok().body(o);
	}
	

}
