package com.book;

import org.springframework.stereotype.Component;

@Component("com1")
public class BookDAOImpl implements BookDAO{

	
	
	@Override
	public void addBook(Book book) {
		// TODO Auto-generated method stub
	 System.out.println("book added");
		
		
	}

	@Override
	public void updateBook(Book book) {
		// TODO Auto-generated method stub
		System.out.println("book updated");
	}
	

}
