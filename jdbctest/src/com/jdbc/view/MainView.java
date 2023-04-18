package com.jdbc.view;

import java.text.Collator;
import java.util.List;
import java.util.Scanner;

import com.jdbc.member.controller.MemberController;
import com.jdbc.member.model.dto.MemberDTO;

public class MainView {
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
				System.out.println("개발중....");
				break;
			case 5:
				System.out.println("개발중....");
				break;
			case 0:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("0~5사이의 메뉴를 입력하세요.");

			}

		}

	}

	public void printMembers(List<MemberDTO> members) {
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
	
	
	
}
