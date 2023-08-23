package com.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import com.model.Item;
import com.model.ItemNotFoundException;
import com.model.Product;

import java.util.*;
@RestController
public class ProductController {
	
	ArrayList<Product> productList=new ArrayList();
	
	public ProductController()
	{
		productList.add(new Product(1,"Coffee",20));
		productList.add(new Product(2,"Espresso",30));
		productList.add(new Product(3,"Latte",40));
		productList.add(new Product(4,"Ice Tea",10));
		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getProduct(@PathVariable int id)
	{
		return new ResponseEntity(productList.get(id-1),HttpStatus.OK);
	}
	
	@PostMapping("/addproduct")
	public ResponseEntity<?> addProduct(@RequestBody Product product,
			UriComponentsBuilder comp)
	{
		
		productList.add(product);
		int id=product.getProductId();
		UriComponents components=comp.path("/{"+id+"}").buildAndExpand(product.getProductId());
		
		return new ResponseEntity(components.toUri().toString(),HttpStatus.CREATED);		
		
	}
	
	
	
	@GetMapping("/getallproducts")
	public ResponseEntity<?> getallproducts(UriComponentsBuilder uricomp)
 	{
		
		ArrayList<String> resourceList=new ArrayList<>();
		for(Product p:productList)
		{
			int id=p.getProductId();
			UriComponents components=uricomp.replacePath("/"+id).build();
			resourceList.add(components.toUriString());
		}
		return new ResponseEntity<>(resourceList,HttpStatus.OK);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
