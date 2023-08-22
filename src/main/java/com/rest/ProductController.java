package com.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.model.Item;
import com.model.ItemNotFoundException;

import java.util.*;
@RestController
public class ProductController {
	
	@GetMapping("/items/{id}")
	public ResponseEntity<?> getProducts(@PathVariable int id)
	{
		Map <Integer,Item> mapitems=new HashMap();
		
		mapitems.put(1, new Item(1,"Coffee",20));
		mapitems.put(2, new Item(2,"Ice Tea",30));
		mapitems.put(3, new Item(3,"Espresso",50));
		
		if(!mapitems.containsKey(id))
		{
			throw new ItemNotFoundException("not found"+id);
		}
		else
		{
			return new ResponseEntity(mapitems.get(id),HttpStatus.OK);
		}
		
		
	}

}
