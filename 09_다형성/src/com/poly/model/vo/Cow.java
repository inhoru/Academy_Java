package com.poly.model.vo;

public class Cow extends Animal{
	
	public Cow() {
		// TODO Auto-generated constructor stub
	}
	
	public Cow(String name,String type,int age) {
		super(name,type,age);
	}
	@Override
	public void bark() {
		System.out.println("으메에!엥!");
	}
	

}
