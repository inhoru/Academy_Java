package com.aip.model.vo;

import java.util.Objects;

public class Person {
	private String name;
	private int age;
	private String address;
	private char gedner;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String name, int age, String address, char gedner) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.gedner = gedner;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public char getGedner() {
		return gedner;
	}

	public void setGedner(char gedner) {
		this.gedner = gedner;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", address=" + address + ", gedner=" + gedner + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, age, gedner, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(address, other.address) && age == other.age && gedner == other.gedner
				&& Objects.equals(name, other.name);
	}//
	
}
