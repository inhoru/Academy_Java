package com.generic.model.vo;

import java.util.Date;
import java.util.Objects;

public class Food implements Comparable{
	private String name;
	private int price;
	private String type;
	private Date day;
	
	public Food() {
		// TODO Auto-generated constructor stub
	}

	public Food(String name, int price, String type, Date day) {
		super();
		this.name = name;
		this.price = price;
		this.type = type;
		this.day = day;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Date getDay() {
		return day;
	}

	public void setDay(Date day) {
		this.day = day;
	}

	@Override
	public String toString() {
		return "Food [name=" + name + ", price=" + price + ", type=" + type + ", day=" + day + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(day, name, price, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Food other = (Food) obj;
		return Objects.equals(day, other.day) && Objects.equals(name, other.name) && price == other.price
				&& Objects.equals(type, other.type);
	}
	
	@Override
	public int compareTo(Object o) {
		Food f=(Food)o;
		if(this.price>f.price) return +1;
		else if(this.price<f.price) return -1;
		else return 0;
	}
	
	
}
