package com.sebastian.amazonviewer.model;

import java.util.Date;

public class Magazine {

	private int id;
	private String tittle;
	private Date edititionDate;
	private String editorial;
	private String[] authors;

	public Magazine(String tittle, Date edititionDate, String editorial) {
		super();
		this.tittle = tittle;
		this.edititionDate = edititionDate;
		this.editorial = editorial;
	}
	
	
}
