package com.sebastian.amazonviewer.model;

import java.util.Date;

public class Book {
	
	private int id;
	private String tittle;
	private Date edititionDate;
	private String editorial;
	private String[] authors;
	private String isbn;
	private boolean readed;
	private int timeReaded;
	
	public Book(String tittle, Date edititionDate, String editorial, String isbn) {
		super();
		this.tittle = tittle;
		this.edititionDate = edititionDate;
		this.editorial = editorial;
		this.isbn = isbn;
	}
	
	

}
