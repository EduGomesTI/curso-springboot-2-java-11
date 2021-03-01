package com.cursojava.workshop.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cursojava.workshop.entities.User;
import com.cursojava.workshop.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findByIdd(Long id) {
		Optional<User> user = repository.findById(id);
		return user.get();
	}
	
	public User insert(User obj) {
		return repository.save(obj);
	}
}
