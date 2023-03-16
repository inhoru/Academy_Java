package com.bs.example.practice4.model.vo;

public class Student {
	private int grade;
	private int classroom;
	private String name;
	private double height;
	private char gender;
	
	public Student() {}
	{
		grade=1;
		classroom=2;
		name="강태풍";
		height=180.5;
		gender='남';
	}
	
	
	



	public int getGrade() {
		return grade;
	}



	public void setGrade(int grade) {
		this.grade = grade;
	}



	public int getClassroom() {
		return classroom;
	}



	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public double getHeight() {
		return height;
	}



	public void setHeight(double height) {
		this.height = height;
	}



	public char getGender() {
		return gender;
	}



	public void setGender(char gender) {
		this.gender = gender;
	}
	public void information() {
		
		System.out.println(grade+" "+classroom+" "+name+" "+height+" "+gender);
		
	}
	
	
}
