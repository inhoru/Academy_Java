package com.bs.practice.func;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class OperatorPractice {
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 :");
		int num = sc.nextInt();
		System.out.println(num>0?"양수다":"양수가 아니다");
		
		
	}
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		System.out.println(0<num?"양수다":0==num?"0이다":"음수다");
	}
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		System.out.println(num%2==0?"짝수다":"홀수다");
		
	}
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("인원 수 : ");
		int num = sc.nextInt();
		System.out.print("사탕 개수 : ");
		int num1 = sc.nextInt();
		System.out.println("1인당 사탕 개수 : " + (num1/num) + "\n" + "남는 사탕 개수 : " + num1%num);
		
	}
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("학년(숫자만) : ");
		int grade = sc.nextInt();
		System.out.print("반(숫자만) : ");
		int cs = sc.nextInt();
		System.out.print("번호(숫자만 : ");
		int num = sc.nextInt();
		System.out.print("성별(M/F) : ");
		char gender = sc.next().charAt(0);
		System.out.print("성적(소수점 아래 둘째자리까지) : ");
		double result = sc.nextDouble();
		System.out.println(gender=='M'?grade + "학년 " + cs + "반 " + num + "번 " + name + " 남학생의 성적은 " + result:
			grade + "학년 " + cs + "반 " + num + "번 " + name + " 여학생의 성적은 " + result + "이다.");
		
	}
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 : " );
		int age = sc.nextInt();
		System.out.println();
		System.out.println(13>=age?"어린이":13<age&&19>=age?"청소년":"성인");
	}
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 : ");  //세과목이 합계가 180 이상이나와야 평균60점이상이 나온다.
		int score = sc.nextInt();
		System.out.print("영어 : ");
		score += sc.nextInt();
		System.out.print("수학 : ");
		score += sc.nextInt();
		double average = score/(double)3;//소수점 아래 안보이게 하고싶으면 더블을 지우고 인트끼리 나누기로 바꾼다.
		System.out.println(average>=60?"합계 : " + score + "\n" + "평균 : " + average + "\n" + "합격":"합계 : " + score + "\n" + "평균 : " + average + "\n" +"불합격");
	}
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호를 입력하세요(- 포함) : ");
		char num1 = sc.next().charAt(7);
		System.out.println(num1=='2'||num1=='4'?"여자":"남자");
	
	}
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		System.out.print("입력 : ");
		int num3 = sc.nextInt();
		System.out.println(num1>=num3||num2<num3?"\ntrue":"false");
		
	}
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력1 : ");
		int num = sc.nextInt();
		System.out.print("입력2 : ");
		int num1 = sc.nextInt();
		System.out.print("입력3 : ");
		int num2 = sc.nextInt();
		System.out.println(num==num1&&num1==num2?"\ntrue":"false");
	}
	public void practice11() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("A사원의 연봉 : ");
		int income = sc.nextInt();
		
		System.out.print("B사원의 연봉 : ");
		int income1 = sc.nextInt();
		
		System.out.print("C사원의 연봉 : ");
		int income2 = sc.nextInt();
		
		double incentives = income * 1.4;  //2500*1은 어차피 2500이다 그러니간 곱하기 1.4를 해주면 0.4를 곱해서 더하는거랑 똑같은거다.
		double incentives1 = income1;
		double incentives2 = income2 * 1.15;
		
//		System.out.printf("\nA사원 연봉/연봉+a : %d/%.1f\n", income, incentives);
//		System.out.println(3000<=incentives?"3000 이상":"3000 미만");
//		
//		System.out.printf("B사원 연봉/연봉+a : %d/%.1f\n", income1, incentives1);
//		System.out.println(3000<=incentives1?"3000 이상":"3000 미만");
//		
//		System.out.printf("C사원 연봉/연봉+a : %d/%f\n", income2, incentives2);
//		System.out.println(3000<=incentives2?"3000 이상":"3000 미만");

		
		System.out.println(3000<=incentives?"\nA사원 연봉/연봉+a : " + income + "/" + incentives + "\n3000 이상":
			"\nA사원 연봉/연봉+a : " + income + "/" + incentives + "\n3000 미만");
		
		System.out.println(3000<=incentives1?"B사원 연봉/연봉+a : " + income1 + "/" + incentives1 + "\n3000 이상":
			"A사원 연봉/연봉+a : " + income1 + "/" + incentives1 + "\n3000 미만");
		
		System.out.println(3000<=incentives2?"C사원 연봉/연봉+a : " + income2 + "/" + incentives2 + "\n3000 이상":
			"A사원 연봉/연봉+a : " + income2 + "/" + incentives2 + "\n3000 미만");
		
		
	}
}
