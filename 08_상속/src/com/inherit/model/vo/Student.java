package com.inherit.model.vo;

import java.util.Objects;

public class Student extends Person {
	//이름, 나이, 성별, 전화번호, 주소
	//수강과목, 특이사항, 수준
	private String joinClass;
	private String issue;
	private char level;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int age, char gender, String phone, String address,String joinClass, String issue, char level) {
		super(name,age,gender,phone,address);//부모클래스매개변수잇는생성자호출 매개변수있는생성자가있어야만가능
		this.joinClass = joinClass;
		this.issue = issue;
		this.level = level;
	}

	public String getJoinClass() {
		return joinClass;
	}

	public void setJoinClass(String joinClass) {
		this.joinClass = joinClass;
	}

	public String getIssue() {
		return issue;
	}

	public void setIssue(String issue) {
		this.issue = issue;
	}

	public char getLevel() {
		return level;
	}

	public void setLevel(char level) {
		this.level = level;
	}
//	public String infoStudent() {//디스를안써도된다 매개변수슈퍼로 부모를받앗기때문이다
//		return getName() + " "+getAge()+ " "+getGender()+" "+getPhone()
//		+" "+getAddress()+" " +getJoinClass()+" "+getIssue()+" "+getLevel();
//	}
	public String infoStudent() {
		return infoPerson()+joinClass+" "+issue+" "+level;
	}
	@Override
	public String info() {
		return infoStudent();
		
	}
	@Override
	public boolean equals(Object o) {
		//객체의 동등성비교를 하기위해 설정
		//필드의 값을 가지고 생성된 값이 같은지 비교하기 위해
		Student s= (Student)o;
		if(getName().equals(s.getName())&&getAge()==s.getAge()&&getGender()==s.getGender()&&
				getAddress()==s.getAddress()&&getPhone()==s.getPhone()&&joinClass.equals(joinClass)) {
			return true;
			
		}
		
			return false;
	}
	//toString Override하기
	@Override
	public String toString() {
		return getName()+ " "+getAge()+ " "+getGender()+" "+getPhone()+" "+ getAddress()+" "+joinClass+" "+issue+" "+level;
		
	}
	@Override
	public int hashCode() {
		//equals에서 동등비교의 기준이 된 필드를 매개변수로 넣어줌.
		return Objects.hash(getName(),getAge(),getGender(),getPhone(),getAddress(),joinClass);
	}
	//clone : 객체복사메소드
	// 깊은복사를 구현
	@Override
	public Student clone() {
		return new Student(getName(),getAge(),getGender(),getPhone(),getAddress(),joinClass,issue,level);
	}
}
