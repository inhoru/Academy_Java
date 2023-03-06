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
		if(num==1) {
			System.out.print("입력 메뉴입니다.");
		}else if(num==2) {
			System.out.print("수정 메뉴입니다.");
		}else if(num==3) {
			System.out.print("조회 메뉴입니다.");
		}else if(num==4) {
			System.out.print("삭제 메뉴입니다.");
		}else if(num==7 ) {
			System.out.print("프로그램이 종료됩니다.");
		}else {
			System.out.print("번호를 잘못입력하셧습니다.");
		}
		
	}
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 한 개 입력하세요 : ");
		int num = sc.nextInt();
		if(num>0&&num%2==0) {
			System.out.println("짝수다.");
		}else if(num<0){
			System.out.println("양수만 입력해주세요.");
		}else {
			System.out.println("홀수다");
		}
	}
}
