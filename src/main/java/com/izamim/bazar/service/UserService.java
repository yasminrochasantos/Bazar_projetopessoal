package com.izamim.bazar.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.izamim.bazar.model.User;
import com.izamim.bazar.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public User insert(User user) {
		User u = repository.save(user);
		return u;
	}
	
}
