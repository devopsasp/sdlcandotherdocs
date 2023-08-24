package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.model.Item;
import java.util.*;
@Repository
public interface ItemRepository extends JpaRepository<Item,Integer>{

	 public Item findItemByItemName(String itemName);
	 public List<Item> findItemByPrice(float price);
}
