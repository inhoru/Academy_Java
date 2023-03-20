package com.inter.model.vo;

import com.inter.common.Motionable;

public class Rabbit extends Animal implements Motionable{
	
	@Override
	public void brak() {
		System.out.println("끼끼이룩루끼");
	}
	@Override 
	public void forward() {
		System.out.println("깡총깡총 앞으로");
		
	}
	@Override
	public void back() {
		System.out.println("깡총깡총 뒤로");
		
	}
	@Override
	public void jump() {
		System.out.println("깡총깡총 점프");
		
	}
	
}
