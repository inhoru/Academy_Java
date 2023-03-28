package com.collection.model.vo;

import java.util.Objects;

public class Fruit {
	private String name;
	private String country;
	private int num;
	private int price;

	public Fruit() {
	}

	@Override
	public int hashCode() {
		return Objects.hash(country, name, num, price);
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
		return Objects.equals(country, other.country) && Objects.equals(name, other.name) && num == other.num
				&& price == other.price;
	}

	@Override
	public String toString() {
		return "Fruit [name=" + name + ", country=" + country + ", num=" + num + ", price=" + price + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Fruit(String name, String country, int num, int price) {
		this.name = name;
		this.country = country;
		this.num = num;
		this.price = price;
	}
}
