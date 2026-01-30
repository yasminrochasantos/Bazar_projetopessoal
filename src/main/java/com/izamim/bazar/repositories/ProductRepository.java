package com.izamim.bazar.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.izamim.bazar.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
