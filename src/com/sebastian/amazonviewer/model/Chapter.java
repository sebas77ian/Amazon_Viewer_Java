package com.sebastian.amazonviewer.model;

public class Chapter {

	private int id;
	private String tittle;
	private int duration;
	private short year;
	private boolean viewed;
	private int timeViewed;
	private int sessionNumber;
	
	public Chapter(String tittle, int duration, short year) {
		super();
		this.tittle = tittle;
		this.duration = duration;
		this.year = year;
	}
	
	
}
