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
		double total = (double) num1 / num;
		double rest = (num % num1);
		System.out.print("1인당 나눠가진 초콜릿개수 : " + (total) + "\n나눠주고 남은 초콜릿개수 : " + rest);

	}

	public void ex5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어점수 : ");
		int score = sc.nextInt();
		System.out.print("영어점수 : ");
		int score1 = sc.nextInt();
		System.out.print("수학점수 : ");
		int score2 = sc.nextInt();
		int total = score + score1 + score2;
		System.out.println("합계 : " + total + "\n평균 : " + total / 3.0);
	}

	public void ex6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("중간고사 : ");
		int score11 = sc.nextInt();
		System.out.print("기말고사 : ");
		int score111 = sc.nextInt();
		System.out.print("과제점수 : ");
		int score21 = sc.nextInt();
		System.out.print("출석회수 : ");
		int score3 = sc.nextInt();
		int total1 = (score111 + score111 + score21 + score3);
		double averge = total1 / 4.0;
		if (score111 >= 40 && score111 >= 40 && score21 >= 40 && score3 >= 40 && total1 >= 160 && averge >= 60) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
	}

	public void ex7() {

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("*");
		}
	}

	public void ex8() {
		Scanner sc = new Scanner(System.in);
		int su = 0;
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
			su = sc.nextInt();
			switch (su) {
			case 1:
				System.out.print("정수 입력 : ");
				int num = sc.nextInt();
				System.out.print("정수 입력 : ");
				int num1 = sc.nextInt();

				System.out.println("합 : " + (num + num1));
				System.out.println("차 : " + (num - num1));
				System.out.println("곱 : " + (num * num1));
				System.out.println("나누기 : " + ((double) num / num1));
				break;
			case 2:
				System.out.print("문자 입력 : ");
				char ch = sc.next().charAt(0);

				System.out.println((int) ch);
				break;
			case 3:
				System.out.print("영어문자열 입력 : ");
				sc.nextLine();
				String msg = sc.nextLine();
				char ch1 = msg.charAt(0);
				char ch2 = msg.charAt(1);
				char ch3 = msg.charAt(2);
				System.out.println("" + ch1 + "" + "" + ch2 + "" + "" + ch3 + "");
				break;

			case 4:
				System.out.print("인원 수 : ");
				int people = sc.nextInt();
				System.out.print("초콜릿 개수 : ");
				int chocolate = sc.nextInt();
				double total = (double) chocolate / people;
				double rest = (people % chocolate);
				System.out.println("1인당 나눠가진 초콜릿개수 : " + (total) + "\n나눠주고 남은 초콜릿개수 : " + rest + "\n");
				break;
			case 5:
				System.out.print("국어점수 : ");
				int score = sc.nextInt();
				System.out.print("영어점수 : ");
				int score1 = sc.nextInt();
				System.out.print("수학점수 : ");
				int score2 = sc.nextInt();
				int totall = score + score1 + score2;
				System.out.println("합계 : " + totall + "\n평균 : " + totall / 3.0);
				break;
			case 6:
				System.out.print("중간고사 : ");
				int score11 = sc.nextInt();
				System.out.print("기말고사 : ");
				int score111 = sc.nextInt();
				System.out.print("과제점수 : ");
				int score21 = sc.nextInt();
				System.out.print("출석회수 : ");
				int score3 = sc.nextInt();
				int total1 = (score111 + score111 + score21 + score3);
				double averge = total1 / 4.0;
				if (score111 >= 40 && score111 >= 40 && score21 >= 40 && score3 >= 40 && total1 >= 160 && averge >= 60) {
					System.out.println("합격");
				} else {
					System.out.println("불합격");
				}break;
			case 7:
				for (int i = 0; i < 4; i++) {
					for (int j = 0; j <i; j++) {
						System.out.print("*");
					}
					System.out.println("*");
				}break;
			
			case 9:

				System.out.println("프로그램을종료합니다.");
				break;
			}
		} while (su != 9);
	}
}
