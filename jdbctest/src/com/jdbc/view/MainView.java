package com.jdbc.view;

import java.sql.Date;
import java.util.List;
import java.util.Scanner;

import com.jdbc.member.controller.MemberController;
import com.jdbc.member.model.dto.MemberDTO;

public class MainView {
	private static final Date Date = null;
	private MemberController controller = new MemberController();

	public void mainMenu() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("==== jdbc 회원관리 프로그램 ====");
			System.out.println("1. 전체회원조회");
			System.out.println("2. 아이디로 회원조회");
			System.out.println("3. 이름으로 회원조회");
			System.out.println("4. 회원등록");
			System.out.println("5. 회원수정(이름, 나이, 이메일, 주소)");
			System.out.println("6. 회원삭제");
			System.out.println("0. 프로그램종료");
			System.out.print("메뉴 입력 : ");
			int cho = sc.nextInt();
			switch (cho) {
			case 1:
				controller.selectAllMember();break;
			case 2:
				controller.searchId();break;
			case 3:
				controller.searchName();break;
				
			case 4:
				controller.insertMember();break;
			case 5:
				controller.updateMember();break;
			case 6 : 
				controller.removeData();break;
			case 0:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("0~5사이의 메뉴를 입력하세요.");

			}

		}

	}

	public void printMembers(List members) {
		System.out.println("==== 조회된 결과 ====");
		members.forEach(m -> System.out.println(m));
		System.out.println("==================");

	}
	public void printMember(MemberDTO m) {
		System.out.println("==== 조회된 결과 ====");
		System.out.println(m!=null?m:"검색결과가 없습니다.");
		System.out.println("==================");
	}
	public String inputData (String data) {
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 "+ data + "입력 : ");
		return  sc.nextLine();
		
	}
	public MemberDTO addMember () {
		Scanner sc = new Scanner(System.in);
		MemberDTO m = new MemberDTO();
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		m.setMemberId(id);
		System.out.print("비밀번호 : ");
		String pwd = sc.nextLine();
		m.setMemberPwd(pwd);
		System.out.print("이름 : ");
		String name = sc.nextLine();
		m.setMemberName(name);
		System.out.print("성별(M/F) : ");
		char gender = sc.next().charAt(0);
		m.setGender(gender);
		System.out.print("나이 : ");
		int age = sc.nextInt();
		m.setAge(age);
		sc.nextLine();
		System.out.print("이메일 : ");
		String email = sc.nextLine();
		m.setAddress(email);
		System.out.print("전화번호 : ");
		String phone = sc.nextLine();
		m.setPhone(phone);
		System.out.print("주소 : ");
		String address = sc.nextLine();
		m.setAddress(address);
		System.out.print("취미(,로 구분) : ");
		String[] hobby = sc.nextLine().split(",");
		m.setHobby(hobby);
		return m;
		//매개변수도잇는  생성자도 사용가능하지만 m.set도가능하다.
		//return new MemberDTO(id,pwd,name,gender,age,email,phone,address,hobby,null);
		
	}
	public void printMsg(String msg) {
		System.out.println("==== 시스템 메세지 ====");
		System.out.println(msg);
		System.out.println("====================");
	}
	public MemberDTO updateData() {
		Scanner sc = new Scanner(System.in);
		MemberDTO m = new MemberDTO();

		System.out.print("수정할 회원아이디 : ");
		m.setMemberId(sc.nextLine());
		System.out.print("새 이름 : ");
		m.setMemberName(sc.nextLine());
		System.out.print("새 나이 : ");
		m.setAge(sc.nextInt());
		System.out.print("새 이메일 : ");
		sc.nextLine();
		m.setEmail(sc.nextLine());
		System.out.print("수정할 주소 : ");
		m.setAddress(sc.nextLine());
		return m;

	}
	//회원삭제
	public String removeData() {
		Scanner sc = new Scanner(System.in);
		System.out.print("삭제할 아이디 입력 : ");
		return sc.nextLine();
		
		
	}

}
