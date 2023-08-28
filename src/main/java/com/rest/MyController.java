package com.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.sleuth.SpanName;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import java.util.*;
import org.springframework.core.ParameterizedTypeReference;
@RestController
public class MyController {
	
	@Autowired
	RestTemplate restTemplate;
	 
	@GetMapping("/")
	@SpanName(value = "homemethod")
	public String home()
	{
 
 return "rest data accessed";
	}

	@GetMapping("/viewitems")
	 public ResponseEntity<?> viewItems()
	 { 
		 String url="http://localhost:9093/getallitems";
		 
		 
		 ResponseEntity<List<Object>> response = restTemplate.exchange(
		     url,
		     HttpMethod.GET,
		     null,
		     new ParameterizedTypeReference<List<Object>>(){});
		 List<Object> objects = response.getBody();
		return  response;
		 
		
		 
	
		 
		
	 }
}
