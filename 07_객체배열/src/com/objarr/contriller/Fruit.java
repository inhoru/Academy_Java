package com.objarr.contriller;

public class Fruit {
	private String name;
	private double weight;
	private String color;
	private int price;
	
	public Fruit(String name,double weight,String color,int price) {
		this.name=name;
		this.weight=weight;
		this.color=color;
		this.price=price;
		
	}
	public String infoFruit () {
		return this.name+ " "+this.weight+" "+this.color+" "+this.price;
	}
	public double getWeight() {
		return this.weight;
	}
	public double getPrice() {
		return this.price;
	}

}
