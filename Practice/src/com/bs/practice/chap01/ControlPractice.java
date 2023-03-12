package com.bs.practice.chap01;

import java.util.Scanner;

public class ControlPractice {

	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		System.out.println("메뉴 번호를 입력하세요 : ");
		int num = sc.nextInt();
		if (num == 1) {
			System.out.print("입력 메뉴입니다.");
		} else if (num == 2) {
			System.out.print("수정 메뉴입니다.");
		} else if (num == 3) {
			System.out.print("조회 메뉴입니다.");
		} else if (num == 4) {
			System.out.print("삭제 메뉴입니다.");
		} else if (num == 7) {
			System.out.print("프로그램이 종료됩니다.");
		} else {
			System.out.print("번호를 잘못입력하셧습니다.");
		}

	}

	public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 한 개 입력하세요 : ");
		int numb = sc.nextInt();
		if (numb > 0 && numb % 2 == 0) {
			System.out.println("짝수다.");
		} else if (numb < 0) {
			System.out.println("양수만 입력해주세요.");
		} else {
			System.out.println("홀수다.");
		}
	}

	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 : ");
		int su = sc.nextInt();
		System.out.print("영어 : ");
		int su1 = sc.nextInt();
		System.out.print("수학 : ");
		int su2 = sc.nextInt();
		double average = (su + su1 + su2) / 3;
		if (40 <= su && 40 <= su1 && 40 <= su2 && 60 <= average) {
			System.out.println("국어점수 : " + su + "\n" + "수학점수 : " + su1 + "\n" + "영어점수 : " + su2 + "\n" + "국어 : " + su
					+ "\n수학 : " + su1 + "\n영어 : " + su2 + "\n합계 : " + (su + su1 + su2) + "\n평균 : "
					+ ((su + su1 + su2) / 3.0) + "\n축하합니다, 합격입니다!");
		} else {
			System.out.println("국어점수 : " + su + "\n" + "수학점수 : " + su1 + "\n" + "영어점수 : " + su2 + "\n" + "불합격입니다.");
		}

	}

	public void practice4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1~12 사이의 정수 입력 : ");
		int month = sc.nextInt();
		// 1,2,12월이면 -> 겨울
		// 3~5월이면 -> 봄
		// 6~8월이면 -> 여름
		// 9~11월이면 -> 가을
		switch (month) {
		case 1:
			System.out.println(month + "월은 겨울입니다.");
			break;
		case 2:
			System.out.println(month + "월은 겨울입니다.");
			break;
		case 3:
			System.out.println(month + "월은 봄입니다.");
			break;
		case 4:
			System.out.println(month + "월은 봄입니다.");
			break;
		case 5:
			System.out.println(month + "월은 봄입니다.");
			break;
		case 6:
			System.out.println(month + "월은 여름입니다.");
			break;
		case 7:
			System.out.println(month + "월은 여름입니다.");
			break;
		case 8:
			System.out.println(month + "월은 여름입니다.");
			break;
		case 9:
			System.out.println(month + "월은 가을입니다.");
			break;
		case 10:
			System.out.println(month + "월은 가을입니다.");
			break;
		case 11:
			System.out.println(month + "월은 가을입니다.");
			break;
		case 12:
			System.out.println(month + "월은 겨울입니다.");
			break;
		default:
			System.out.println(month + "월은 잘못 입려된 달입니다.");
			break;
		}
	}

	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 : ");
		String id1 = sc.next();
		System.out.print("비밀번호 : ");
		String pa1 = sc.next();
		if (id1.equals("myId") && pa1.equals("myPassword12")) {
			System.out.print("로그인 성공");
		} else if (!id1.equals("myId") && pa1.equals("myPassword12")) {
			System.out.print("아이디가 틀렸습니다.");
		} else if (id1.equals("myId") && !pa1.equals("mypassword12")) {
			System.out.print("비밀번호가 틀렸습니다.");
		}

	}

	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		String rating = sc.next();
		if (rating.equals("관리자")) {
			System.out.print("회원관리, 게시글 관리 게시글 작성, 댓글 작성, 게시글 조회");
		} else if (rating.equals("회원")) {
			System.out.print("게시글 작성, 게시글 조회, 댓글 작성");
		} else if (rating.equals("비회원")) {
			System.out.print("게시글 조회");
		}

	}

	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("키(m)를 입력해 주세요 : ");
		double m = sc.nextDouble();
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double kg = sc.nextDouble();
		double bmi = kg / (m * m);
		if (bmi < 18.5) {
			System.out.print("BMI 지수 :" + bmi + "\n저체중");
		} else if (18.5 <= bmi && 23 > bmi) {
			System.out.print("BMI 지수 :" + bmi + "\n정상체중");
		} else if (23 <= bmi && 25 > bmi) {
			System.out.print("BMI 지수 :" + bmi + "\n과체중");
		} else if (25 <= bmi && 30 > bmi) {
			System.out.print("BMI 지수 :" + bmi + "\n비만");
		}
	}

	public void practice8() {
		Scanner sc = new Scanner(System.in);
		int su11 = sc.nextInt();
		System.out.print("피연산자2 입력 : ");
		int su111 = sc.nextInt();
		System.out.print("연산자를 입력(+,-,*,/,%)");
		char ch = sc.next().charAt(0);
		switch (ch) {
		case '+':
			System.out.println("" + su111 + ch + su111 + "" + "=" + (su111 + su111));
			break;
		case '-':
			System.out.println("" + su111 + ch + su111 + "" + "=" + (su111 - su111));
			break;
		case '*':
			System.out.println("" + su111 + ch + su111 + "" + "=" + (su111 * su111));
			break;
		case '/':
			System.out.printf("" + su111 + ch + su111 + "" + "=" + "%.6f", ((double) su111 / su111));
			break;
		case '%':
			System.out.println("" + su111 + ch + su111 + "" + "=" + (su111 & su111));
			break;
		}

	}

	public void practice9() {
		Scanner sc = new Scanner(System.in); // 백분율 계산 (현재)80.0*(퍼센트)20/(전체)100
		System.out.print("중간 고사 점수 : ");
		int score = sc.nextInt();
		System.out.print("기말 고사 점수 : ");
		int score1 = sc.nextInt();
		System.out.print("과제 점수 : ");
		int tast = sc.nextInt();
		System.out.print("출석 회수 : ");
		int at = sc.nextInt();
		double average = (score * 20.0) / 100.0;
		double average1 = (score1 * 30.0) / 100.0;
		double average2 = (tast * 30.0) / 100.0;
		double average3 = (at * 20.0) / 20.0;
		double total = average + average1 + average2 + average3;

		System.out.println("=========결과=========");
		if (70 <= total && at >= 14) {
			System.out.print("중간 고사 점수(20) : " + average + "\n기말 고사 점수(30) : " + average1 + "\n과제점수\t(30) : " + average2
					+ "\n출석점수\t(20) : " + average3 + "\n총점 : " + total + "\nPASS");
		} else if (70 > total && at >= 14) {
			System.out.print("중간 고사 점수(20) : " + average + "\n기말 고사 점수(30) : " + average1 + "\n과제점수\t(30) : " + average2
					+ "\n출석점수\t(20) : " + average3 + "\n총점 : " + total + "\nFail [점수 미달]");
		} else if (at <= 14) {
			System.out.println("Fall [출석 회수 부족]" + (at + "/20"));

		}

	}

	public void practice10() {
		Scanner sc = new Scanner(System.in);
		System.out.println("실행할 기능을 선택하세요.");
		System.out.println("1.메뉴 출력");
		System.out.println("2.짝수/홀수");
		System.out.println("3.합격/불합격");
		System.out.println("4.계절");
		System.out.println("5.로그인");
		System.out.println("6.권한 확인");
		System.out.println("7.BMI");
		System.out.println("8.계산기");
		System.out.println("9.P/F");
		int number = sc.nextInt();
		switch (number) {
		case 1:
			practice1();
			break;

		case 2:
			practice2();
			break;

		case 3:
			practice3();
			break;

		case 4:
			practice4();
			break;

		case 5:
			practice5();
			break;

		case 6:
			practice6();
			break;

		case 7:
			practice7();
			break;

		case 8:
			practice8();
			break;

		case 9:
			practice9();
			break;

		}
	}

	public void practice11() {
		Scanner sc = new Scanner(System.in);
		System.out.print("비밀번호 입력(1000~9999) : ");
		String number = sc.next();
		int num = Integer.parseInt(number);
		if ((number.length() > 4 || number.length() <= 3)) {
			System.out.println("자리수 안맞음");
		} else if (number.charAt(0) == (number.charAt(1))) {
			System.out.println("중복값있음");
		} else if (number.charAt(0) == (number.charAt(2))) {
			System.out.println("중복값있음");
		} else if (number.charAt(0) == (number.charAt(3))) {
			System.out.println("중복값있음");
		} else if (number.charAt(1) == (number.charAt(0))) {
			System.out.println("중복값있음");
		} else if (number.charAt(1) == (number.charAt(2))) {
			System.out.println("중복값있음");
		} else if (number.charAt(1) == (number.charAt(3))) {
			System.out.println("중복값있음");
		} else if (number.charAt(2) == (number.charAt(0))) {
			System.out.println("중복값있음");
		} else if (number.charAt(2) == (number.charAt(1))) {
			System.out.println("중복값있음");
		} else if (number.charAt(2) == (number.charAt(3))) {
			System.out.println("중복값있음");
		} else if (number.charAt(0) != number.charAt(1) && number.charAt(2) != number.charAt(3)) {
			System.out.println("생성 성공");
		}
		
	}

}
