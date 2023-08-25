package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.model.User;
import com.rest.APIClient;
import com.rest.ItemDTO;
import com.service.UserService;

@RestController
public class UserServiceController {
	
	@Autowired
	UserService userService;
	
	@Autowired
	RestTemplate restTemplate;
	
	@Autowired
	APIClient apiclient;
	
	@PostMapping("/adduser")
	public ResponseEntity<?> addUser(@RequestBody User user)
	{
		return userService.addUser(user);
	}
	
	@GetMapping("/getusers")
	public ResponseEntity<?> getAll()
	{
		return userService.findAll();
	}
	@GetMapping("/getbyid/{id}")
	public ResponseEntity<?> getById(@PathVariable String id)
	{ 
		return userService.getUser(id);
	}

	 @GetMapping("/viewitems")
	 public ResponseEntity<?> viewItems()
	 { 
		 /*String url="http://localhost:9097/getallitems";
		 
		 
		 ResponseEntity<List<Object>> response = restTemplate.exchange(
		     url,
		     HttpMethod.GET,
		     null,
		     new ParameterizedTypeReference<List<Object>>(){});
		 List<Object> objects = response.getBody();
		return  response;*/
		 
		 List<ItemDTO> itemlist=apiclient.getAllItems();
		 
		 return new ResponseEntity<>(itemlist,HttpStatus.CREATED);
		 
		
	 }
}
