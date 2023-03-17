package com.inherit.model.vo;

public class Parent {
	private String title;
	
	protected double weight;
	
	public Parent() {}
	
	public Parent(String title, double weight) {
		this.title=title;
		this.weight=weight;
		
	}
	
	
	public void setTitle(String title) {
		this.title=title;
	}
	public String getTitle() {
		return this.title;
	}
}
