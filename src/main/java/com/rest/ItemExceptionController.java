package com.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.model.ItemNotFoundException;

@ControllerAdvice
public class ItemExceptionController {
	
	@ExceptionHandler(ItemNotFoundException.class)
	public ResponseEntity<String> exception(ItemNotFoundException e)
	{
		return new ResponseEntity<>("Item not found",HttpStatus.NOT_FOUND);
	}

}
