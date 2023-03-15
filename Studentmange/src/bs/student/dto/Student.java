package bs.student.dto;

import java.text.SimpleDateFormat;

//사용자가입력한 정보를 저장
public class Student {
	private static int count;
	private String name;
	private String studentNo;
	private int grade;
	private String major;
	private String address;
	private char gender;

	
	{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
		studentNo=sdf.format(System.currentTimeMillis())+"_"+(++count);
		
	}
	
		
	public Student() {}

	public Student(String name, 
			//String studeNo, 
			String major, int grade, String address, char gender) {
		this.name = name;
		//this.studentNo = studeNo;
		this.major = major;
		this.address = address;
		this.grade = grade;
		this.gender = gender;

	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStudentNo() {
		return this.studentNo;
	}

	public void setStudentNo(String studentNo) {//학생번호가자동으로들어오니 막앗다 프라이베이스로
		this.studentNo = studentNo;

	}

	public String getMajor() {
		return this.major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getGrade() {
		return this.grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public char getGender() {
		return this.gender;
	}

	public void setGender(char grade) {
		this.gender = grade;
	}
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address){
		this.address = address;
	}
	
	

	public String infoStudent() {
		return this.studentNo + " " + this.name + " " + this.major
				+ " " + this.grade + " " + this.address + " "
				+ this.gender;
	}
	

}
