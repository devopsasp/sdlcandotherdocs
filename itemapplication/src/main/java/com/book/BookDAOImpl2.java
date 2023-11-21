package com.book;

import org.springframework.stereotype.Component;

@Component("com2")
public class BookDAOImpl2 implements BookDAO{

	@Override
	public void addBook(Book book) {
		// TODO Auto-generated method stub
		
		System.out.println("save to database");
		
	}

	@Override
	public void updateBook(Book book) {
		// TODO Auto-generated method stub
		System.out.println("update to database");
	}

}
