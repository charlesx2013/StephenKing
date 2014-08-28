package com.example.stephenking;

public class Novel {
	
	public int book_image;
	public String published_year;
	public String book_title;
	
	public Novel(String title, String year, int image) {
		this.book_title = title;
		this.published_year = year;
		this.book_image = image;
	}
}
