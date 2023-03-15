package com.obj.model.vo;

public class Member {
	private String id;
	private String pw;
	private String name;
	private int age;
	private String mail;
	
	public Member() {}
	
	
	public void setId(String id) {
		this.id=id;
	}
	public String getId() {
		return this.id;
	}
	public void setPw(String pw) {
		this.pw=pw;
	}
	public String getPw() {
		return this.pw;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return this.name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return this.age;
	}
	public void setMail(String mail) {
		this.mail=mail;
	}
	public String getMail() {
		return this.mail;
	}
	public String infoMember() {
		return this.id + " "+this.pw+" "+this.name+ " "+this.age+ " "+this.mail;
	}
}
