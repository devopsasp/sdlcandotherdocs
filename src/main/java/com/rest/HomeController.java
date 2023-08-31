package com.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import java.util.*;
import java.util.*
;@RestController
public class HomeController {
	
	@Autowired
	AuthenticationManager manager;
	
	@Autowired
	UserRepository repo;
	
	@Autowired
	JWTUtil util;
	
	@Value(value="${secretkey}")
	String secretkey;
	
	
	

@PostMapping("/home")
	public ResponseEntity<?> getHome(@RequestBody User user) throws Exception
	{
	
	   //System.out.println(repo.findById(user.getUsername()));
		
	//	System.out.println(user);
		
		UsernamePasswordAuthenticationToken token=new UsernamePasswordAuthenticationToken(user.getUsername(),user.getPassword());
	
			System.out.println(token.getPrincipal());
	 
		Authentication authentication=manager.authenticate(token);
		
     Map<String ,Object> usermap=new HashMap();
     
        usermap.put(user.getUsername(), user);
		

	String jwttoken=	util.generateToken(usermap, user.getUsername(),secretkey);
		
  		
		
		return new ResponseEntity<>(jwttoken,HttpStatus.OK);
	
	}

	

@GetMapping(value="/home/validate",headers="jwttoken")

public ResponseEntity validateJWT(@RequestHeader String jwttoken)
{ 
   String res= util.validate(jwttoken, secretkey);
    return  new ResponseEntity<>(res,HttpStatus.OK);
}



	
}
