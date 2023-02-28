package com.bs.varlable;

import java.util.Scanner;

public class StudentInfo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.println("당신의 이름은 : " + name);
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		System.out.println("당신의 나이는 : " + age);
		
		System.out.print("성별 : ");
		char gender = sc.next().charAt(0);
		System.out.println("당신의 성별은 : " + gender);
		
		System.out.print("학년 : ");
		int grade = sc.nextInt();
		System.out.println("당신의 학년은 : " + grade);
		
		System.out.print("반 : ");
		int ban = sc.nextInt();
		System.out.println("당신의 반은 : " + ban);
		
		System.out.print("번호 : ");
		int num = sc.nextInt();
		System.out.println("당신의 번호는 : " + num);
		
		System.out.print("키 : ");
		double key = sc.nextDouble();
		System.out.println("당신의 키는 : " + key);
		
		sc.nextLine();
		
		System.out.print("주소 : ");
		String address = sc.nextLine();
		System.out.println("당신의 주소는 : " + address);

		System.out.print("이메일 : ");
		String mail = sc.nextLine();
		System.out.println("당신의 이메일은 : " +mail);
		
		String msg =name + " " + age + " " + gender + " " + grade + " " +
		ban + " " + num + " " + key + " " + address + " " + mail ;
		
		
		
		System.out.println(msg);
		
		
		
		
		
		
		
		
		
		
		
	}

}
