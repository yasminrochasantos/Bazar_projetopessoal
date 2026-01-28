package com.izamim.bazar.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.izamim.bazar.model.User;


public interface UserRepository extends JpaRepository<User, Long>{

}
