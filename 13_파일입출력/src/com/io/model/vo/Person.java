package com.io.model.vo;

import java.io.Serializable;

public class Person implements Serializable{
	private String name;
	private int age;
	private char gender;
	private double height;
	private String address;

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String name, int age, char gender, double height, String address) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.height = height;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + ", height=" + height + ", address="
				+ address + "]";
	}

}
