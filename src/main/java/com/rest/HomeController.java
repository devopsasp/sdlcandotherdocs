package com.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import java.util.*;
@RestController
public class HomeController {
	
	//@Autowired
	//AuthenticationManager manager;
	
	//@GetMapping("/home")
	@PostMapping("/auth")
	public String getHome(@RequestBody User user)
	{
		
	/*	System.out.println(user);
		SimpleGrantedAuthority auth=new SimpleGrantedAuthority(user.getRole());
		ArrayList<GrantedAuthority> authlist=new ArrayList();
		UsernamePasswordAuthenticationToken token=new UsernamePasswordAuthenticationToken(user.getUserName(),user.getPassword(),authlist);
		
				
	 
		Authentication authentication=manager.authenticate(token);
		
 org.springframework.security.core.userdetails.User userdetails=(org.springframework.security.core.userdetails.User
)authentication.getPrincipal();
		
		*/
		
		
		return "authenticated";
	
	}

	
	
}
