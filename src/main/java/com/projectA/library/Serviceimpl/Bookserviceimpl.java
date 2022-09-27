package com.projectA.library.Serviceimpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.projectA.library.Entity.Books;
import com.projectA.library.Repository.LibraryRepository;
import com.projectA.library.Service.Bookservice;

@Service
public class Bookserviceimpl implements Bookservice 
{
	private LibraryRepository bookrepo;
	
	public Bookserviceimpl(LibraryRepository bookrepo) 
	{
		super();
		this.bookrepo = bookrepo;
	}

	@Override
	public List<Books> getAllBooks()
	{
		return bookrepo.findAll();
	}


	@Override
	public Books savebook(Books book)
	{
		return bookrepo.save(book);
		
	}

	@Override
	public Books getbook(long id) 
	{
		return bookrepo.findById(id).get();
	}


	@Override
	public Books updatebook(Books book) 
	{
		return bookrepo.save(book);
	}

	@Override
	public void removebook(long id)
	{
		bookrepo.deleteById(id);
	}

	@Override
	public Books searchbook(long id)
	{
		return bookrepo.findById(id).get();
	}

}
