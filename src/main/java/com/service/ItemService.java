package com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.repository.ItemRepository;
import com.model.Item;
@Service
public class ItemService {
	
	@Autowired
	 ItemRepository itemRepository;
	
	
	  public void addItem(Item item)
	  {
		  itemRepository.save(item);
	  }
	  
	  public void updateItem(Item item)
	  {
		  itemRepository.save(item);
	  }
	  
	  public void deleteItem(Item item)
	  {
		  itemRepository.delete(item);
	  }
	  public List<Item> getAllItems()
	  {
		
		  ArrayList<Item> itemlist=new ArrayList();
		  
		return   itemRepository.findAll();
		  
		  
	  }
	  
	  public Item getItemById(int id)
	  {
		return itemRepository.findById(id).get();  
	  } 
	  
	  public List<Item> findByPrice(float price) 
	  { 
		  return itemRepository.findItemByPrice(price);
	  }
	  
	  public Item findByNane(String name)
	  {
		  return itemRepository.findItemByItemName(name);
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  

}
