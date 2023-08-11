package com.customer;

import java.io.Serializable;

public class Customer implements Serializable{
	private String customerName;
	private String address;

	public Customer()
	{
		
	}
	
	
	
	public Customer(String customerName, String address) {
		super();
		this.customerName = customerName;
		this.address = address;
	}



	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	

}
