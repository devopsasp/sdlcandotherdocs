package com.rest;

public class ItemDTO {
	private int itemId;
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
	public ItemDTO(int itemId, String itemName, float price) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.price = price;
	}
	@Override
	public String toString() {
		return "ItemDTO [itemId=" + itemId + ", itemName=" + itemName + ", price=" + price + "]";
	}
	public ItemDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
