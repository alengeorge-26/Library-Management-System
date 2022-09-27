package com.projectA.library.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="books")
public class Books
{
	@Id
	@Column(name="ID")
	private long id;
	
	@Column(name="NAME",nullable=false)
	private String name;
	@Column(name="AUTHOR",nullable=false)
	private String author;
	@Column(name="GENERE",nullable=false)
	private String genere;
	@Column(name="POSSESOR",nullable=false)
	private String posses;
	
	public Long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getAuthor() {
		return author;
	}
	public String getGenere() {
		return genere;
	}
	public String getPosses() {
		return posses;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setGenere(String genere) {
		this.genere = genere;
	}
	public void setPosses(String posses) {
		this.posses = posses;
	}
	
	public Books(long id, String name, String author, String genere, String posses) {
		super();
		this.id=id;
		this.name = name;
		this.author = author;
		this.genere = genere;
		this.posses = posses;
	}
	
	public Books() 
	{
		
	}
}
