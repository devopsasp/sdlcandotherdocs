package com.model;

public class Item {
	
	private int id;
	private String itemName;
	private float price;
	
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Item(int id, String itemName, float price) {
		super();
		this.id = id;
		this.itemName = itemName;
		this.price = price;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "Item [id=" + id + ", itemName=" + itemName + ", price=" + price + "]";
	}
	
	

}
