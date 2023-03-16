package com.obj.model.vo;

public class Product {
	
	public static int count=1;
	public int empNo;
	public int num;
	public String type ;
	public String name;
	public int pric;
	public double discount ;
	public int quantity ;
	{
		empNo=count++;
	}
	
	
	public Product() {}
	
	public Product(String type,String name
			,int pric) {
		this.type=type;
		this.name=name;
		this.pric=pric;
		
	}
	public Product(String type,String name
			,int pric,double discount) {
		this.type=type;
		this.name=name;
		this.pric=pric;
		this.discount=discount;
		
	}
	public Product(String type,int pric
			,double disconut,int quantity) {
		this.type=type;
		this.pric=pric;
		this.discount=disconut;
		this.quantity=quantity;
		
	
	
	}
	
}
