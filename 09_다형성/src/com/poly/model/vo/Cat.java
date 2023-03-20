package com.poly.model.vo;

public class Cat extends Animal{

	public Cat() {
		// TODO Auto-generated constructor stub
	}
	
	public Cat(String name, String type,int age) {
		super(name, type, age);
	}
	
	public String catbark() {
		return "니야옹 니야오옹!";
	}
	
	@Override
	public void bark() {
		System.out.println(catbark());
	}
}
