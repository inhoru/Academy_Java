package com.ex.controller;

import java.util.Scanner;

public class ExController {

	public void ex1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		System.out.print("정수 입력 : ");
		int num1 = sc.nextInt();

		System.out.println("합 : " + (num + num1));
		System.out.println("차 : " + (num - num1));
		System.out.println("곱 : " + (num * num1));
		System.out.println("나누기 : " + ((double) num / num1));

	}

	public void ex2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자 입력 : ");
		char ch1 = sc.next().charAt(0);

		System.out.print((int) ch1);
	}

	public void ex3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("영어문자열 입력 : ");
		String msg = sc.nextLine();
		char ch1 = msg.charAt(0);
		char ch2 = msg.charAt(1);
		char ch3 = msg.charAt(2);
		System.out.println("" + ch1 + "" + "" + ch2 + "" + "" + ch3 + "");

	}

	public void ex4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("인원 수 : ");
		int num = sc.nextInt();
		System.out.print("초콜릿 개수 : ");
		int num1 = sc.nextInt();
		System.out.print("1인당 나눠가진 초콜릿개수 : " + (num1/num) +
				"\n나눠주고 남은 초콜릿개수 : " + (num1%num));

	}

	public void ex5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어점수 : ");
		int score = sc.nextInt();
		System.out.print("영어점수 : ");
		int score1 = sc.nextInt();
		System.out.print("수학점수 : ");
		int score2 = sc.nextInt();
		int total = (score + score1 + score2);
		double avg = (score+score1+score2)/3.0;
		System.out.println("합계 : " + total + "\n평균 : " + avg);
		System.out.println(score>=40&&score1>=40&&score2>=40?"합격":"불합격");
	}

	public void ex6() {
		Scanner sc = new Scanner(System.in);
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
					+ "\n출석점수\t(20) : " + average3 + "\n총점 : " + total + "\nPASS\n");
		} else if (70 > total && at >= 14) {
			System.out.print("중간 고사 점수(20) : " + average + "\n기말 고사 점수(30) : " + average1 + "\n과제점수\t(30) : " + average2
					+ "\n출석점수\t(20) : " + average3 + "\n총점 : " + total + "\nFail [점수 미달]\n");
		} else if (at <= 14) {
			System.out.println("Fall [출석 회수 부족]" + (at + "/20\n"));

		}
	}

	public void ex7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력 : ");
		int su =sc.nextInt();
		for (int i = 0; i < su;i++) {  // i가 0이고 su를4로작성하면 0 1 2 3 <- 총4번반복
			for (int j = 0; j < i+1; j++) { //i가0 참이되고 바로내려와서 j가0부터다시시작 반복
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void ex8() {
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("====프로그램실행====");
			System.out.println("1.계산기");
			System.out.println("2.유니코드출력");
			System.out.println("3.문자열출력");
			System.out.println("4.초콜릿나누기");
			System.out.println("5.성적합계와평균");
			System.out.println("6.성적평가");
			System.out.println("7.별찍기");
			System.out.println("9.프로그램종료");
			System.out.print("입력 : ");
			int su = sc.nextInt();
			switch (su) {
			case 1:
				ex1();
				break;
			case 2:
				ex2();
				break;
			case 3:
				ex3();
				break;

			case 4:
				ex4();
				break;
			case 5:
				ex5();
				break;
			case 6:
				ex6();
				break;
			case 7:
				ex7();
				break;

			}
			if (su == 9) {
				System.out.println("프로그램을종료합니다.");
				break;
			}

		} while (true);
	}
}
