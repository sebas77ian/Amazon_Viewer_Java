package com.sebastian.amazonviewer;

import java.util.Date;

import com.sebastian.amazonviewer.model.Movie;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		showMenu();
		Movie movie = new Movie("Coco", "Animation", (short)2017);
		
		movie.showData();
	}
	
	public static void showMenu() 
	{
		
		int exit=0;
		
		do {
			
			System.out.println("Bienvenidos a AMAZON VIEWER");
			System.out.println("");
			System.out.println("Selecciona el n�mero de la opci�n deseada");
			System.out.println("1. Movies");
			System.out.println("2. Series");
			System.out.println("3. Books");
			System.out.println("4. Magazine");
			System.out.println("5. Report");
			System.out.println("6. Report Today");
			System.out.println("0. Salir");
			
			int response=0;
			
			switch(response) 
			{
				case 0:break;
				case 1:
					showMovies();
					break;
				case 2:
					showSeries();
					break;
				case 3:
					showBooks();
					break;
				case 4:
					showMagazines();
					break;
				case 5:
					makeReport();
					break;
				case 6:
					//Date date = new Date();
					makeReport(new Date());
					break;
				default:
					System.out.println("");
					break;
			}
			
		}while (exit!=0);
	}
	
	public static void showMovies() {
		int exit = 0;
		do {
			System.out.println();
			System.out.println(":: MOVIES ::");
			System.out.println();
		}while(exit !=0);
		
	}
	
	public static void showSeries() {
		int exit = 0;
		do {
			System.out.println();
			System.out.println(":: SERIES ::");
			System.out.println();
		}while(exit !=0);
	}
	
	public static void showChapters() {
		int exit = 0;
		do {
			System.out.println();
			System.out.println(":: CHAPTERS ::");
			System.out.println();
		}while(exit !=0);
	}
	
	public static void showBooks() {
		int exit = 0;
		do {
			System.out.println();
			System.out.println(":: BOOKS ::");
			System.out.println();
		}while(exit !=0);
	}
	
	public static void showMagazines() {
		int exit = 0;
		do {
			System.out.println();
			System.out.println(":: MAGAZINES ::");
			System.out.println();
		}while(exit !=0);
	}
	
	public static void makeReport() {
		
	}
	
	public static void makeReport(Date date) {
		
	}
}
