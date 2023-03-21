package com.inter.model.vo;

import java.util.Objects;

public class Fruit {

	private String name;
	private String color;
	private int price;
	private double weight;
	public Fruit() {
		// TODO Auto-generated constructor stub
	}
	public Fruit(String name, String color, int price, double weight) {
		super();
		this.name = name;
		this.color = color;
		this.price = price;
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "Fruit [name=" + name + ", color=" + color + ", price=" + price + ", weight=" + weight + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(color, name, price, weight);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fruit other = (Fruit) obj;
		return Objects.equals(color, other.color) && Objects.equals(name, other.name) && price == other.price
				&& Double.doubleToLongBits(weight) == Double.doubleToLongBits(other.weight);
	}
	
}
