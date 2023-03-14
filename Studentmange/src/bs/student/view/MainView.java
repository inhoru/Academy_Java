package bs.student.view;

import java.util.Scanner;

import bs.student.controller.StudentController;
import bs.student.dto.Student;

//사용자에게 보여주는 화면을 제공하는 역할을 하는 클래스
public class MainView {
	
	// 주 메뉴화면을 출력해주는 기능
	public void mainMenu() {
		Scanner sc = new Scanner(System.in);
		StudentController s=new StudentController();//반복문 바같에적엇기때문에 초기화되지않는다
		while(true) {
		System.out.println("====== 학생 관리 프로그램 ======");
		System.out.println("1. 학생등록");
		System.out.println("2. 학생수정(학년, 전공, 주소)");
		System.out.println("3. 학생삭제");
		System.out.println("4. 학생조회");
		System.out.println("5. 이름으로 조회");
		System.out.println("0. 프로그램 종료");
		System.out.print("메뉴 선택 : ");
		int menu=sc.nextInt();
		switch(menu) {
		case 1 : s.insertStudent();break;
		case 2 : System.out.println("학생수정 개발중...");break;
		case 3 : System.out.println("학생삭제 개발중...");break;
		case 4 : s.searchAll();break;
		case 5 : System.out.println("이름으로 조회 개발중...");break;
		case 0 : System.out.println("프로그램을 종료합니다.");return;
			}
		}
	}
	//필요한 학생정보를 입력받는 화면을 출력해주는 기능
	public Student insertStudentView() {
		Scanner sc = new Scanner(System.in);
		System.out.println("==== 학생등록 화면 ====");
		System.out.print("학생이름 : ");
		String name =sc.nextLine();
		System.out.print("학생번호 : ");
		String studentNo=sc.nextLine();
		System.out.print("학년 : ");
		int grade =sc.nextInt();
		sc.nextLine();
		System.out.print("전공 : ");
		String major = sc.nextLine();
		System.out.print("주소 : ");
		String address = sc.nextLine();
		System.out.print("성별(남/여) : ");
		char gender =sc.next().charAt(0);
		Student s = new Student(name,studentNo,major,grade,address,gender);
		return s;

	}
	public void printMsg(String msg) {
		System.out.println("===== 시스템 메세지=====");
		System.out.println(msg);
		System.out.println("====================");
	}
	public void printStudent(String infoStudent) {
		System.out.println("==== 저장 학생정보 ====");
		System.out.println(infoStudent);
		System.out.println("===================");
	}
}
