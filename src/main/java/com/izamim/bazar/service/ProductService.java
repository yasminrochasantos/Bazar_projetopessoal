package com.izamim.bazar.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.izamim.bazar.model.Product;
import com.izamim.bazar.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	
	public Product insert(Product p) {
		return repository.save(p);
	}
	
	

}
