package com.model;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND,reason="Resource was not created or deleted")
public class ResourceNotFoundException  extends Exception{
String message;
	 public ResourceNotFoundException(String message)
	 {
		  this.message=message;
	 }
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	 
	
	
}
