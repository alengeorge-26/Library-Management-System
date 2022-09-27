package com.projectA.library;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LibraryManagementSystemApplication implements CommandLineRunner
{

	public static void main(String[] args) 
	{
		SpringApplication.run(LibraryManagementSystemApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception
	{
	}

}
