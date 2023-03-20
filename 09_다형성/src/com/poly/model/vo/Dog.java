package com.poly.model.vo;

public class Dog extends Animal{

	public Dog() {
		// TODO Auto-generated constructor stub
	}
	
	public Dog(String name, String type,int age) {
		super(name, type, age);
	}
	
	
	public String dogBark() {
		return "멍멍!";
	}
	@Override
	public void bark() {
		System.out.println(dogBark());
	}
}
