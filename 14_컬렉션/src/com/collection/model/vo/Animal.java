package com.collection.model.vo;

import java.util.Objects;

public class Animal {
	private String name;
	private double weight;
	private int age;
	private String type;
	
	public Animal() {
		// TODO Auto-generated constructor stub
	}

	public Animal(String name, double weight, int age, String type) {
		super();
		this.name = name;
		this.weight = weight;
		this.age = age;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + ", weight=" + weight + ", age=" + age + ", type=" + type + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, name, type, weight);
	}
//
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		return age == other.age && Objects.equals(name, other.name) && Objects.equals(type, other.type)
				&& Double.doubleToLongBits(weight) == Double.doubleToLongBits(other.weight);
	}
	
	
}
