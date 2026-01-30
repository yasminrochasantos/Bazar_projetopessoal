package com.izamim.bazar.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.izamim.bazar.model.Product;
import com.izamim.bazar.repositories.ProductRepository;
import com.izamim.bazar.service.exception.ResourceNotFound;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	
	public Product insert(Product p) {
		return repository.save(p);
	}
	
	public List<Product> findAll() {
		return repository.findAll();
	}
	
	public Product findById(Long id) {
		Optional<Product> p = repository.findById(id);
		return p.orElseThrow(() -> new ResourceNotFound(id));
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}

}
