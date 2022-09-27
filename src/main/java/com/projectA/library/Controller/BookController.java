package com.projectA.library.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.projectA.library.Entity.Books;
import com.projectA.library.Login.Login;
import com.projectA.library.Serviceimpl.Bookserviceimpl;

@Controller
public class BookController 
{
	private Bookserviceimpl bookserv;

	public BookController(Bookserviceimpl bookserv)
	{
		this.bookserv = bookserv;
	}
	
	@GetMapping("/login")
	public String loginform()
	{
		return "login";
	}
	
	@GetMapping("/books")
	public String listbooks(Model model)
	{
		model.addAttribute("books",bookserv.getAllBooks());
		return "books";
	}
	
	@GetMapping("/books/new")
	public String createbooks(Model model)
	{
		Books book=new Books();
		model.addAttribute("book",book);
		return "create_book";
	}
	
	@PostMapping("/books")
	public String savebook(@ModelAttribute("book")Books book)
	{
		bookserv.savebook(book);
		return "redirect:/books";
	}
	
	@GetMapping("/books/edit/{id}") 
	public String editbook(@PathVariable String id,Model model)
	{
		model.addAttribute("book",bookserv.getbook(Long.parseLong(id)));
		return "edit_book";
	}
	
	@PostMapping("/books/{id}")
	public String updatebook(@PathVariable String id,@ModelAttribute("book")Books book)
	{
		Books old = bookserv.getbook(Long.parseLong(id));
		old.setPosses(book.getPosses());
		bookserv.updatebook(old);
		return "redirect:/books";
	}
	
	@GetMapping("/books/remove/{id}")
	public String removebook(@PathVariable String id)
	{
		bookserv.removebook(Long.parseLong(id));
		return "redirect:/books";
	}
	
	@PostMapping("/login")
	public String login(@ModelAttribute(name="loginform")Login loginform)
	{
		String user = loginform.getUsername();
		String pass = loginform.getPassword();
		
		if("alenalen".equals(user) && "passpass".equals(pass))
		{
			return "redirect:/books";
		}
		return "redirect:/login";		
	}
}