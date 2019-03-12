package com.sebastian.amazonviewer.model;

public class Serie {
	
	private int id;
	private String tittle;
	private String genre;
	private String creator;
	private int duration;
	private short year;
	private boolean viewed;
	private int timeViewed;
	
	int sessionQuantity;
	
	public Serie(String tittle, String genre, int duration) {
		super();
		this.tittle = tittle;
		this.genre = genre;
		this.duration = duration;
	}

}
