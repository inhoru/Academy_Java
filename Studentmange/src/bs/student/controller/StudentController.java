package bs.student.controller;

import bs.student.dao.StudentDao;
import bs.student.dto.Student;
import bs.student.view.MainView;

public class StudentController {
	//싱글톤패턴으로 객체 생성하기
	private static StudentController controller;
	
	private StudentController() {}
	
	public static StudentController getStudentController() {
		if(controller==null) controller=new StudentController();
		return controller;//싱글톤 패턴 다시보기
		
	}
	
//private StudentDao dao = new StudentDao();// 멤버변수가 들어가있는 객체는 한번만 만든다. 그래서 멤버변수로 선언해서 관리한다람쥐.
	//private MainView view = new MainView();// 메인뷰를생성한건데 가보면 메인뷰에가보면 멤버변수로 스튜던트컨트롤러를 생성한다 계속 둘이지지고볶아서 안된다람쥐;
	
	
	// 프로그램을 시작하는 기능
	public void startProgram() {
		MainView.getMainView().mainMenu();

	}

	public void insertStudent() {
		// 학생을 등록하는 서비스
		// 1. 사용자로부터 저장할 학생에대한 정보를 입력받는다.
		Student s = MainView.getMainView().insertStudentView();
		// 2. studentdao 에 받은 학생을 저장하기
		boolean result = StudentDao.getStudentDao().insertStudent(s);
		// 3. 입력한 결과에 따라 사용자에게 메세지를 출력
		String msg = result ? "학생등록 성공:)" : "학생등록실패:(";
		MainView.getMainView().printMsg(msg);
	}

	public void searchAll() {
		// 전체 학생을 조회하는 서비스
		// 1.StudentDao에저장된 학생정보 가져오기
		// s1,s2,s3,s4정보가져오기
		String infoStudent = StudentDao.getStudentDao().infoStudentAll();// 위에 멤버변수로 만든 객체가있다.
		// 2. 가져온 정보를 화면에 출력해준다.
//		String data;
//		if(infoStudent.equals("")) {
//			data="저장된 학생이 없습니다."	;
//			
//		}else {
//			data=infoStudent;
//		} 이것도 가능 이게 밑에꺼랑 똑같은 내용이다람쥐.
		MainView.getMainView().printStudent(infoStudent.equals("") ? "저장된 학생이 없습니다." : infoStudent);

	}

	public void searchByName() {
		// 사용자가 입력한 이름을 기준으로 학생을 조회하는 서비스
		// 1.사용자가 이름을 입력할 수 있게 화면을 출력해줌
		// 2.사용자가 입력한 이름을 가져와 저장소에있는 데이터와 비교할 결과를 가져옴
		// 3. 결과를 사용자에게 출력해줌.
		String name = MainView.getMainView().inputName();
		String result = StudentDao.getStudentDao().searchByName(name);
		MainView.getMainView().printStudent(result);

	}
	public void updateStudent() {
		//지정한 학생의 학년, 전공, 주소를 변경하는 서비스
		//1. 사용자에게 수정할 학생, 수정할 학년,수정할 전공, 수정할 주소를 입력받음
		searchAll();
		Student s =MainView.getMainView().updateStudentView();
		//2. 저장된 학생 중 수정할 학생을 찾아 s에 저장된 데이터로 수정
		boolean result = StudentDao.getStudentDao().updateStudent(s);
		MainView.getMainView().printMsg(result?s.getStudentNo()+"학생수정완료 :)":s.getStudentNo()+"학생수정실패 :(");
		
		
	}
}
