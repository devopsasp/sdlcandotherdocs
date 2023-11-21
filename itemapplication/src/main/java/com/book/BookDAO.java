package com.book;

import org.springframework.stereotype.Repository;

@Repository
public interface BookDAO {
	
	public void addBook(Book book);
	public void updateBook(Book book);

}
