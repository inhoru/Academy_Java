package com.poly.model.vo;

public abstract class Character {
	private int hp;
	private int level;
	private String name;
	
	public Character() {
		// TODO Auto-generated constructor stub
	}

	public Character(int hp, int level, String name) {
		super();
		this.hp = hp;
		this.level = level;
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	//alt+s+s+s enter
	@Override
	public String toString() {
		return "Character [hp=" + hp + ", level=" + level + ", name=" + name + "]";
	}
	
	
	public abstract void attack();
	
	public abstract void defence();
	
	
}
