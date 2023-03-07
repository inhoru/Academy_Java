package com.bs.variable;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		//사용자가 키보드로 입력한 값을 가져오기
		//java.util.Scanner클래스를 이용한다.
		//1. Scanner클래스를 import해주기 -> import java.util.Scanner;
		//2. Scanner클래스를 생성해주기 -> Scanner sc=new Scanner(Syste.in);
		Scanner sc=new Scanner(System.in);
		//3. Scanner클래스가 제공하는 기능을 이용해서 데이터를 받아오기
		// 자료형에 따라 기능제공
		// 정수형 : nextInt()
		// 실수형 : nextDouble()
		// 문자열 : next() or nextLine()
		//입력받을 값에 대한 정보를 출력해줘야한다.
		System.out.print("취미 : ");
		String hobby=sc.nextLine();
		
		System.out.print("나이 : ");
		int age=sc.nextInt();
		System.out.println(age);
		
		System.out.print("당신의 이름 : ");
		String name=sc.next();//입력한 문자열의 띄어쓰기를 기준으로 값을 가져옴
		System.out.println("입력한 이름 : "+name);
		sc.nextLine();//버퍼를 비워주는 역할
		System.out.print("당신의 주소는 : ");
		String address=sc.nextLine();
		//입력한 문자열의 개행을 기준으로 값을 가져옴.
		System.out.println(address);
		
		
		System.out.print("키 : ");
		double height=sc.nextDouble();
		System.out.println("입력키 : "+height);
		
		
		//char타입 입력받기
		//성적등급, 성별
		System.out.print("성별(M/F) : ");
		char gender=sc.next().charAt(0);
		System.out.println("입력한 성별 : "+gender);
		
		//학생정보를 입력받고 출력하는 기능 구현하기
		//이름, 나이, 성별(남,여), 학년, 반, 번호, 키, 주소, 이메일 입력받고
		//입력받은 내용을 출력하기
		//com.bs.variable.StudentInfo클래스를 생성해서 구현할것.
		//1. 입력받은 값을 출력 바로 출력
		//2. 한번에 출력
		// 유병승 19 남 1 3 3 180.5 경기도 시흥시 teacherdev09@gmail.com
		
		
	}
}
