package com.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/home")
	public String getHome()
	{
		return "Hello User!";
	}

	@GetMapping("/home/user")
	 public String getHomeUser()
	 {
		return "Hello Home User";
	 }
	 @GetMapping("/users")
	 public String getUsers()
	 {
		 return "Hello User";
	 }
	 @PostMapping("/adduser")
	 public String addUser()
	 {
		 return "user added";
	 }
	
}
