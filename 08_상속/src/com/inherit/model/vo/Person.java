package com.inherit.model.vo;

public class Person {
	private String name;
	private int age;
	private char gender;
	private String phone;
	private String address;

	// 기본생성자 생성
	// 단축키 : 컨트롤 스페이스 엔터
	public Person() {

	}
	// 매개변수 있는 생성자
	// 단축키 : 알트+s+a+g

	public Person(String name, int age, char gender, String phone, String address) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
		this.address = address;
	}

	// 멤버변수별 setter/getter
	// 단축키 : 알트 s+r+a+r
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	protected String infoPerson() {// 디스를안써도된다 매개변수->슈퍼로 부모를받앗기때문이다
		return name + " " + age + " " + gender + " " + phone + " " + address;

	}
	// override : 메소드를 재정의
	// 클래스가 상속관계일때 부모클래스에 선언된 메소드를 자식클래스가 재정의하는 것

	public String info() {
		return infoPerson();
	}

}
