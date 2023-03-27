package com.collection.model.vo;

import java.util.Objects;

public class person {
	private String name;
	private int age;
	private char gender;
	private double height;
	private double weight;
	
	public person() {
	}

	public person(String name, int age, char gender, double height, double weight) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.height = height;
		this.weight = weight;
	}

	public String getNaem() {
		return name;
	}

	public void setNaem(String name) {
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

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "person [name=" + name + ", age=" + age + ", gender=" + gender + ", height=" + height + ", Weight="
				+ weight + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(weight, age, gender, height, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		person other = (person) obj;
		return weight == other.weight && age == other.age && gender == other.gender
				&& Double.doubleToLongBits(height) == Double.doubleToLongBits(other.height)
				&& Objects.equals(name, other.name);
	}
	
}
