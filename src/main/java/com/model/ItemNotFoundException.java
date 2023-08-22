package com.model;

public class ItemNotFoundException extends RuntimeException{
	private String message;
	public ItemNotFoundException(String message)
	{
		this.message=message;
	}
	public String toString()
	{
		return "error-->"+message;
	}

}
