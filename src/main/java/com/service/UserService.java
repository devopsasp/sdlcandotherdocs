package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.model.User;
import com.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	public ResponseEntity<?> addUser(User user)
	{
		
		userRepository.save(user);
		return new ResponseEntity<>("user added successfullt",HttpStatus.CREATED);
	}
	
	public ResponseEntity<?> findAll()
	{
		 return new ResponseEntity(userRepository.findAll(),HttpStatus.FOUND);
	}
	
	public ResponseEntity<?> getUser(String id)
	{
		return new ResponseEntity<>(userRepository.findById(id),HttpStatus.FOUND);
	}

}
