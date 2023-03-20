package com.poly.model.vo;

import java.util.Arrays;

public class Wizard extends Character{
	private int mp;
	private String[] magic=new String[3];
	
	public Wizard() {
		// TODO Auto-generated constructor stub
	}
	
	public Wizard(int hp, int level, String name, 
			int mp, String[] magic) {
		super(hp, level, name);
		this.mp = mp;
		this.magic = magic;
	}

	public Wizard(int mp, String[] magic) {
		super();
		this.mp = mp;
		this.magic = magic;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public String[] getMagic() {
		return magic;
	}

	public void setMagic(String[] magic) {
		this.magic = magic;
	}

	@Override
	public String toString() {
		return super.toString()+" Wizard [mp=" + mp + ", magic=" + Arrays.toString(magic) + "]";
	}
	
	public void wizardAttack() {
		int index=(int)(Math.random()*3);
		System.out.println(magic[index]+"마법으로 공격");
	}
	public void wizardDefence() {
		System.out.println("지팡이로 막기!");
	}
	
	@Override
	public void attack() {
		wizardAttack();
	}
	@Override
	public void defence() {
		wizardDefence();
	}
	
}
