package com.bs.example.practice3.model.vo;

public class Circle {
	private double PI;
	private int radius;

	
	public Circle() {
		PI=3.14;
		radius=1;
		System.out.println(radius*2*PI);
		System.out.println(radius*radius*PI);
	}
	
	public void incrementRadius() {
		radius++;
	}
	public void getAreaOfCircle() {
		System.out.println((this.radius*2)*PI);
	}
	public void getSizeOfCircle() {
		System.out.println(this.radius*this.radius*PI);
	}

	public double getPI() {
		return PI;
	}

	public void setPI(double pI) {
		PI = pI;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
}
