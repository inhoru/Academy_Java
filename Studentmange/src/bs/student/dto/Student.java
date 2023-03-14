package bs.student.dto;
//사용자가입력한 정보를 저장
public class Student {
	private String name;
	private String studentNo;
	private int grade;
	private String major;
	private String address;
	private char gender;

	public Student() {

		
		
	}

	public Student(String name, String studeNo, String major, int grade, String address, char gender) {
		this.name = name;
		this.studentNo = studeNo;
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

	public void setStudentNo(String studentNo) {
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

	public String infoStudent() {
		return this.studentNo + " " + this.name + " " + this.major
				+ " " + this.grade + " " + this.address + " "
				+ this.gender;
	}
	

}
