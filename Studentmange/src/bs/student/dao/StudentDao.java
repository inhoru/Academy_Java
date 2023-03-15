package bs.student.dao;

import bs.student.dto.Student;

//데이터를 저장해서 관리하는 곳
public class StudentDao {
	private static StudentDao dao;
	public static StudentDao getStudentDao() {
		if(dao==null) dao =new StudentDao();
		return dao;
	}
	private Student s1;						// 클래스도 가능하다.
	private Student s2;
	private Student s3;
	private Student s4;
	

	private StudentDao() {
	}

	// 학생을 저장소에 저장하는 기능
	public boolean insertStudent(Student s) {
		// boolean result = true;
		if (null == s1) {
			// s1은 비었다~!!
			s1 = s;
		} else if (null == s2) {
			s2 = s;
		} else if (null == s3) {
			s3 = s;
		} else if (null == s4) {
			s4 = s;
		} else {// 입력실패
			return false;
		}
		return true;

	}

	// 학생전체정보를 제공해주는 기능
	public String infoStudentAll() {
		// s1,s2,s3,s4에 저장된 학생정보 종합
		// 1. 각s들에 저장이 되어있는지-> sn!=null
		String totalStudent = "";//아무것도해당하지않으면 공백으로 반환
		if (s1 != null) {
			totalStudent += s1.infoStudent() + "\n";

		}
		if (s2 != null) {
			totalStudent += s2.infoStudent() + "\n";
		}
		if (s3 != null) {
			totalStudent += s3.infoStudent() + "\n";
		}
		if (s4 != null) {
			totalStudent += s4.infoStudent() + "\n";
		}
		
		return totalStudent;
	}
	//이름으로 조회
	public  String searchByName (String name) {
		String result = "";
		 if(s1!=null&&s1.getName().equals(name)) {//s1이null이면 뒤에꺼를 확인안한다.
			 result+=s1.infoStudent()+"\n";
		 }if(s2!=null&&s2.getName().equals(name)) {
			 result+=s2.infoStudent()+"\n";
		 }if(s3!=null&&s3.getName().equals(name)) {
			 result+=s3.infoStudent()+"\n";
		 }if(s4!=null&&s4.getName().equals(name)) {
			 result+=s4.infoStudent()+"\n";
		 }
			
		return result;
	}
	//수정하는것
	public boolean updateStudent (Student s) {
		if(s1!=null&&s1.getStudentNo().equals(s.getStudentNo())) {
			s1.setGrade(s.getGrade());
			s1.setMajor(s.getMajor());
			s1.setAddress(s.getAddress());
		}else if(s2!=null&&s2.getStudentNo().equals(s.getStudentNo())) {
			s2.setGrade(s.getGrade());
			s2.setMajor(s.getMajor());
			s2.setAddress(s.getAddress());
		}else if(s3!=null&&s3.getStudentNo().equals(s.getStudentNo())) {
			s3.setGrade(s.getGrade());
			s3.setMajor(s.getMajor());
			s3.setAddress(s.getAddress());
		}else if(s4!=null&&s4.getStudentNo().equals(s.getStudentNo())) {
			s4.setGrade(s.getGrade());
			s4.setMajor(s.getMajor());
			s4.setAddress(s.getAddress());
		}else {
			return false;
		}
		return true;
		

		
		
	}


}
