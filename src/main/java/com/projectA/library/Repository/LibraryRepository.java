package com.projectA.library.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectA.library.Entity.Books;

public interface LibraryRepository extends JpaRepository<Books,Long>
{
	
}
