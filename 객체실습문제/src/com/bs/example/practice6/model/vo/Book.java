package com.bs.example.practice6.model.vo;

public class Book {
	private String title;
	private String publisher;
	private String author;
	private int price;
	private double discountRate;
	
	public Book() {}
	
	
	public Book(String title,String publisher,String author) {		
		this.title=title;
		this.publisher=publisher;
		this.author=author;
	}
	
	
	public Book(String title,String publisher,String author,int price,double discountRate) {
		this.title=title;
		this.publisher=publisher;
		this.author=author;
		this.price=price;
		this.discountRate=discountRate;
		
	}
	
		 public void inform() {
		        String bookInform = this.title + " " + this.publisher + " " + this.author;
		        if (this.price > 0) {
		            bookInform += " " + this.price;
		        }
		        if (this.discountRate > 0) {
		            bookInform += " " + this.discountRate;
		        }
		        System.out.println(bookInform);
		    }   
	
}
