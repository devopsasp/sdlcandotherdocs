package com;

public class Item {
	
	private String itemName;
	private float price;
	private int quantity;
	public Item() {
		// TODO Auto-generated constructor stub
	}
	public Item(String itemName, float price, int quantity) {
		super();
		this.itemName = itemName;
		this.price = price;
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Item [itemName=" + itemName + ", price=" + price + ", quantity=" + quantity + "]";
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
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	

}
