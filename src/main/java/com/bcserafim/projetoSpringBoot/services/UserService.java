package com.bcserafim.projetoSpringBoot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bcserafim.projetoSpringBoot.entities.User;
import com.bcserafim.projetoSpringBoot.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		
		return repository.findAll();
		
	}
	
	public User findById (Long id) {
		
		Optional<User> obj = repository.findById(id);
		return obj.get();
		
		
	}
	
	
}
