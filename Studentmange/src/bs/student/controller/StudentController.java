package bs.student.controller;

import bs.student.dao.StudentDao;
import bs.student.dto.Student;
import bs.student.view.MainView;

public class StudentController {
	private StudentDao dao = new StudentDao();//멤버변수가 들어가있는 객체는 한번만 만든다. 그래서 멤버변수로 선언해서 관리한다람쥐.
	
	//프로그램을 시작하는 기능
	public void startProgram() {
		new MainView().mainMenu();
		
	}
	public void insertStudent() {
		//학생을 등록하는 서비스
		//1. 사용자로부터 저장할 학생에대한 정보를 입력받는다.
		Student s=new MainView().insertStudentView();
		//2. studentdao 에 받은 학생을 저장하기
		boolean result = dao.insertStudent(s);
		//3. 입력한 결과에 따라 사용자에게 메세지를 출력
		String msg = result?"학생등록 성공:)":"학생등록실패:(";
		new MainView().printMsg(msg);
	}
	public void searchAll() {
		//전체 학생을 조회하는 서비스
		//1.StudentDao에저장된 학생정보 가져오기
		//s1,s2,s3,s4정보가져오기
		String infoStudent = dao.infoStudentAll();//위에 멤버변수로 만든 객체가있다.
		//2. 가져온 정보를 화면에 출력해준다.
//		String data;
//		if(infoStudent.equals("")) {
//			data="저장된 학생이 없습니다."	;
//			
//		}else {
//			data=infoStudent;
//		} 이것도 가능 이게 밑에꺼랑 똑같은 내용이다람쥐.
		new MainView().printStudent(infoStudent.equals("")?"저장된 학생이 없습니다.":infoStudent);
		
	}
}
