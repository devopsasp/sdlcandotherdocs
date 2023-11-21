package com.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class BookDAOService {

	@Autowired
	@Qualifier("com2")
	BookDAO bookDAO;
	
	public void add(Book book) 
	{
		bookDAO.addBook(book);
	}
	public void update(Book book)
	{ 
		bookDAO.updateBook(book);
	}
}
