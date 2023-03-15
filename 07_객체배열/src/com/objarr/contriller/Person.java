package com.objarr.contriller;

public class Person {
	private String name;
	private int age;
	private String address;
	private String number;
	
	public Person () {}
	
	public Person (String name, int age, String address, String number) {
		this.name=name;
		this.age=age;
		this.address=address;
		this.number=number;
	}
	
	
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return this.name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return this.age;
	}
	public void setAddress(String address) {
		this.address=address;
	}
	public String getAdderss() {
		return this.address;
	}
	public void setNumber(String number) {
		this.number=number;
		
	}
	public String getNumber() {
		return this.number;
		
	}
	public String infoPerson() {
		return this.name+ " "+this.age+" "+this.address+" "+ this.number;
		
	}
}
