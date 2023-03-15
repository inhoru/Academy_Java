package com.objarr.contriller;

public class Animal {
	private String type;
	private String name;
	private int age;
	private double whight;
	private char gender;

	public Animal() {

	}

	public Animal(String type, String name, int age, double whight, char gender) {
		this.type = type;
		this.name = name;
		this.age = age;
		this.whight = whight;
		this.gender = gender;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return this.type;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return this.age;
	}

	public void setWhight(double whight) {
		this.whight = whight;
	}

	public double getWhight() {
		return this.whight;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public char getGender() {
		return this.gender;
	}

	public String infoAnimal() {
		return this.type + " " + this.name + " " + this.age + " " 
	+ this.whight + " " + this.gender;
	}
	
}
