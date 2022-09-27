package com.projectA.library.Service;

import java.util.List;

import com.projectA.library.Entity.Books;

public interface Bookservice 
{
	List<Books> getAllBooks();
	
	Books savebook(Books book);
	
	Books getbook(long id);
	
	Books updatebook(Books book);
	
	void removebook(long id);
	
	Books searchbook(long id);
}
