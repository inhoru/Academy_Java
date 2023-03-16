package com.bs.example.practice1.model.vo;

public class Member {
	private String memberId;
	private String memberPwd;
	private String memberName;
	private int age;
	private char gender;
	private String phone;
	private String email;
	
	
	public Member() {
		this.memberId="admin";
		this.memberPwd="abcdef";
		this.memberName="강된장";
		this.age=15;
		this.gender='남';
		this.phone="01012344444";
		this.email="admin@1234.com";
	};
	
	
	public void changeName(String name) {
		this.memberName=name;
		
		
	}
	
	public void printName() {
		System.out.println(this.memberName);
		
	}
}
