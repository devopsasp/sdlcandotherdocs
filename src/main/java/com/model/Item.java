package com.model;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.hateoas.RepresentationModel;

import javax.persistence.Column;

@Entity
@Table(name="ItemTable")
public class Item  {
	
	@Id
	private int itemId;
	
	@Column(name="ProductName")
	private String itemName;
	
	private float price;

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Item(int itemId, String itemName, float price) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName + ", price=" + price + "]";
	}
	
		public Item()
		{
			
		}

}
