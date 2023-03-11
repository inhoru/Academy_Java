package com.test;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		boolean falg = true;
		Scanner sc = new Scanner(System.in);
		while (falg) {
			System.out.println("==== my 계산기 ====");
			System.out.print("정수입력 : ");
			int su = sc.nextInt();
			System.out.print("정수입력 : ");
			int su2 = sc.nextInt();
			System.out.print("연산자(+,-,*,/) : ");
			char op = sc.next().charAt(0);
			switch (op) {
			case '+':
				System.out.println("" + su + op + su2 + "=" + (su + su2));
				break;
			case '-':
				System.out.println("" + su + op + su2 + "=" + (su - su2));
				break;
			case '*':
				System.out.println("" + su + op + su2 + "=" + (su * su2));
				break;
			case '/':
				System.out.println("" + su + op + su2 + "=" + ((double) su / su2));
				break;
			}
			
			boolean fa = true;
			while (fa)
			System.out.print("종료하시겠습니까?(Y/N)");
			char exit = sc.next().charAt(0);
			if (exit == 'Y') {
				System.out.println("프로그램을 종료합니다.");
				fa = false;
				falg = false;
			} else {
				System.out.println("잘못입력하셨습니다");
				fa = false;
			}

		}
	}
}
