package com.collection.model.vo;

import java.util.Objects;

public class Animal {
	private String name;
	private double weight;
	private int age;
	private String kind;
	public Animal() {
	}
	public Animal(String name, double weight, int age, String kind) {
		this.name = name;
		this.weight = weight;
		this.age = age;
		this.kind = kind;
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
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	@Override
	public String toString() {
		return "Animal [name=" + name + ", weight=" + weight + ", age=" + age + ", kind=" + kind + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, kind, name, weight);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		return age == other.age && Objects.equals(kind, other.kind) && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(weight) == Double.doubleToLongBits(other.weight);
	}

}
