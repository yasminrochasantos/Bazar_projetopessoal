package com.izamim.bazar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.izamim.bazar.model.Product;
import com.izamim.bazar.service.ProductService;

@RestController
@RequestMapping(value = "/product")
public class ProductController {
	
	@Autowired
	private ProductService service;
	
	@PostMapping
	public ResponseEntity<Product> insert(@RequestBody Product p){
		service.insert(p);
		return ResponseEntity.ok().body(p);
		
	}

}
