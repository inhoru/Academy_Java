package com.inherit.model.vo;

public class BasicTest extends Parent{
	private int number;
	
	//생성자 활용하기
	public BasicTest() {
		//super("기본",100.5);
		super();
	}
	
	public BasicTest(String title,int number,double weight) {
		//setTitle(title);
		//super.weight=weight;
		super(title,weight);//맨위에선언되어야한다.
		//this() 이것도마찬가지 젤위에올라가야한다 동시에사용불가능 디스에 슈퍼를넣던가해야한다.
		this.number=number;
	}
	
	public void setNumber(int number) {
		this.number=number;
		
	}
	public int getNumber() {
		return this.number;
	}
	//부모클래스에 선언된 필드,메소드에 접근하기
	//필드,메소드는 접근제한자의 영향을 받는다.
	//프라이빗이라 직접접근은 불가능하고, gettet,settet를 이용해서
	//접근해야한다.
	public String infoBasicTest() {
		return getTitle()+number+weight;
	}
	
}
