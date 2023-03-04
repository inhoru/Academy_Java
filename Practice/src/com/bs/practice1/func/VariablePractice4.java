package com.bs.practice1.func;

import java.util.Scanner;

public class VariablePractice4 {
	public static void character() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하세요 :");
		String fruit = sc.next();
		char ch1 = fruit.charAt(0);
		System.out.print("첫 번째 문자 :" + ch1 + "\n");
		char ch2 = fruit.charAt(1);
		System.out.print("두 번째 문자 :" + ch2 + "\n");
		char ch3 = fruit.charAt(2);
		System.out.print("세 번째 문자 :" + ch3 + "\n");
	}
}
