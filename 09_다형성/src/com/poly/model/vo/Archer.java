package com.poly.model.vo;

public class Archer extends Character {
	private int area;
	public Archer() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Archer(int hp, int level, String name, int area) {
		super(hp, level, name);
		this.area = area;
	}


	protected Archer(int area) {
		super();
		this.area = area;
	}

	public void setArea(int area) {
		this.area = area;
	}


	@Override
	public String toString() {
		return "Archer [area=" + area + "]";
	}
	@Override
	public void attack() {
		System.out.println(area+"범위 내에서 공격");
	}
	@Override
	public void defence() {
		System.out.println("활로 막기");
	}
}
