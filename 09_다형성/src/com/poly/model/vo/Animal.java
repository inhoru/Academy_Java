package com.poly.model.vo;

public abstract class Animal {
	//위에껀 추상클래스다.
	private String name;
	private String type;
	private int age;

	public Animal() {
		// TODO Auto-generated constructor stub
	}

	

	public Animal(String name, String type, int age) {
		super();
		this.name = name;
		this.type = type;
		this.age = age;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	//자식클래스에서 반드시 구현해야할 메소드가 있다면
	//adstract예약어를 사용해서 처리한다.
	//1. 메소드의 선언문만 작성함.
	//2. 구현부는 자식클래스에서 구현을 한다. - > 자식클래스가 Override에서 구현
	
	
//	//어떤 메소드를 강조하기위해서abstract사용한다면 위에클래스에예약어에도써야한다.
	//
	public abstract void bark();
	
}
