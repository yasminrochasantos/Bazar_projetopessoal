package com.izamim.bazar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@GetMapping
	public ResponseEntity<List<Product>> findAll(){
		List<Product> p = service.findAll();
		return ResponseEntity.ok().body(p);
		
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Product> findById(@PathVariable Long id){
		Product u = service.findById(id);
		return ResponseEntity.ok().body(u);
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id){
		service.delete(id);
		return ResponseEntity.noContent().build();
	}
	
}
