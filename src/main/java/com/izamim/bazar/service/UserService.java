package com.izamim.bazar.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.izamim.bazar.model.User;
import com.izamim.bazar.repositories.UserRepository;
import com.izamim.bazar.service.exception.ResourceNotFound;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public User insert(User user) {
		User u = repository.save(user);
		return u;
	}
	
	public List<User> findAll() {
		return repository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> p = repository.findById(id);
		return p.orElseThrow(() -> new ResourceNotFound(id));
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
	
	public User update(Long id, User u) {
		User us = repository.getReferenceById(id);
		us.setName(u.getName());
		us.setEmail(u.getEmail());
		us.setCpf(u.getCpf());
		us.setPhone(u.getPhone());
		repository.save(us);
		
		return us;
	}

}
