package com.example.demo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Book {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) 
	private Long id;
	private String titile;
	private String author;
	private String reader;
	private String desctription;
	
	
	
	public Book(Long id, String titile, String author, String reader,
			String desctription) {
		super();
		this.id = id;
		this.titile = titile;
		this.author = author;
		this.reader = reader;
		this.desctription = desctription;
	}
	
	
	
	public Book() {
		super();
	}



	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitile() {
		return titile;
	}
	public void setTitile(String titile) {
		this.titile = titile;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getDesctription() {
		return desctription;
	}
	public void setDesctription(String desctription) {
		this.desctription = desctription;
	}
	public String getReader() {
		return reader;
	}
	public void setReader(String reader) {
		this.reader = reader;
	}

}
