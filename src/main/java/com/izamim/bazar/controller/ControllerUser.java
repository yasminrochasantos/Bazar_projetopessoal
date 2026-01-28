package com.izamim.bazar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.izamim.bazar.model.User;
import com.izamim.bazar.repositories.UserRepository;

@RestController
@RequestMapping(value = "/users")
public class ControllerUser {

	@Autowired
	private UserRepository repository;
	
	
	@PostMapping
	public ResponseEntity<User> insert (@RequestBody User user){
		repository.save(user);
		return ResponseEntity.ok().body(user);
	}
}
