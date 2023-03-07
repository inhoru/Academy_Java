package com.bs.variable;

import java.util.Scanner;

public class StudentInfo {
	public static void main(String[] args) {
		//학생정보를 입력받고 출력하는 기능 구현하기
		//이름, 나이, 성별(남,여), 학년, 반, 번호, 키, 주소, 이메일 입력받고
		//입력받은 내용을 출력하기
		//com.bs.variable.StudentInfo클래스를 생성해서 구현할것.
		//1. 입력받은 값을 출력 바로 출력
		//2. 한번에 출력
		// 유병승 19 남 1 3 3 180.5 경기도 시흥시 teacherdev09@gmail.com
		Scanner sc=new Scanner(System.in);
		System.out.print("이름 : ");
		String name=sc.next();
		System.out.print("나이 : ");
		int age=sc.nextInt();
		System.out.print("성별(남/여) : ");
		char gender=sc.next().charAt(0);
		System.out.print("학년 : ");
		int grade=sc.nextInt();
		System.out.print("반 : ");
		int classNumber=sc.nextInt();
		System.out.print("번호 : ");
		int number=sc.nextInt();
		System.out.print("키 : ");
		double height=sc.nextDouble();
		sc.nextLine();
		System.out.print("주소 : ");
		String address=sc.nextLine();
		System.out.print("이메일 : ");
		String email=sc.nextLine();
		String studentInfo=name+" "+age+" "+gender+" "+grade
				+" "+classNumber+" "+number+" "+height
				+" "+address+" "+email;
		System.out.println(studentInfo);
		
		
		
		
	}
}
