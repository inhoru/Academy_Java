package com.collection.model.vo;

import java.util.Objects;

public class Student implements Comparable{
	private String name;
	private int grade;
	private int classNumber;
	private char gender;
	
	public Student() {
	}

	public Student(String name, int grade, int classNumber, char gender) {
		super();
		this.name = name;
		this.grade = grade;
		this.classNumber = classNumber;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getClassNumber() {
		return classNumber;
	}

	public void setClassNumber(int classNumber) {
		this.classNumber = classNumber;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", grade=" + grade + ", classNumber=" + classNumber + ", gender=" + gender
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(classNumber, gender, grade, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return classNumber == other.classNumber && gender == other.gender && grade == other.grade
				&& Objects.equals(name, other.name);
	}
	@Override
	public int compareTo(Object o) {
		
		return this.name.compareTo(((Student)o).name);
	}
	
}
