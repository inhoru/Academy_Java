package com.bs.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int su = sc.nextInt();
		for (int i = 1; i <= su; i++) {
			System.out.print(" " + i);

		}
		if (su <= 0) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}

	}

	public void practice2() {
		Scanner sc = new Scanner(System.in);
		int su = 0;
		do {
			System.out.print("1 이상의 숫자를 입력하세요 : ");
			su = sc.nextInt();
			for (int i = 1; i <= su; i++) {
				System.out.print(" " + i);

			}
			if (su < 1) {
				System.out.print("1 이상의 숫자를 입력해주세요 : ");
			}
		} while (su < 1);
	}

	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1 이상의 숫자를 입력하세요: ");
		int su = sc.nextInt();
		for (int i = su; i >= 1; i--) {
			System.out.println(i);
		}
		if (su < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}

	}

	public void practice4() {
		Scanner sc = new Scanner(System.in);
		int su = 0;
		do {
			System.out.print("1 이상의 숫자를 입력하세요 : ");
			su = sc.nextInt();
			for (int i = su; i >= 1; i--) {
				System.out.print(i + " ");

			}
			if (su < 1) {
				System.out.println("1 이상의 숫자를 입력해주세요 : ");
			}
		} while (su < 1);
	}

	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나를 입력하세요 : ");
		int su = 0;
		int total = 0;
		su = sc.nextInt();
		for (int i = 1; i <= su; i++) {
			if (i != su) {
				System.out.print(i + " + ");
				total += i;
			} else if (i == su) {
				System.out.print(i);
				total += i;
			}

		}
		System.out.println(" = " + total);
	}

	public void practice6() {
		Scanner sc = new Scanner(System.in);
//		int su = sc.nextInt();
//		for (int i = 1; i <= su; i++) {
//			System.out.print(" " + i);

		System.out.print("첫 번째 숫자 : ");
		int num = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int num1 = sc.nextInt();
		// num>=100&&num<=200
		for (int i = num; i <= num1 && num > 0; i++) {
			System.out.print(i);
		}

		for (int j = num1; j <= num && num1 > 0; j++) {
			System.out.print(j);
		}
		if (num <= 0 || num1 <= 0) {
			System.out.println("1이상의 숫자를 입력해주세요.");
		}

	}

	public void practice7() {
		Scanner sc = new Scanner(System.in);
		boolean tr = true;
		while (tr) {
			System.out.print("첫 번째 숫자 : ");
			int su = sc.nextInt();
			System.out.print("두 번째 숫자 : ");
			int su1 = sc.nextInt();
			for (int i = su1; i <= su && su1 > 0; i++) {
				System.out.print(i);
				tr = false;
			}
			for (int j = su; j <= su1 && su > 0; j++) {
				System.out.print(j);
				tr = false;
			}
			if (su <= 0 || su1 <= 0) {
				tr = true;
				System.out.println("1 이상의 숫자를 입력해주세요.");
			}
		}
	}

	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		System.out.println("==== " + num + "단 ====");
		for (int i = 1; i <= 1; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(num + "*" + j + " = " + (num * j));
			}

		}

	}

	public void practice9() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int numder = sc.nextInt();
		for (int i = numder; i <= 9; i++) {
			System.out.println("==== " + numder + " 단 ====");
			for (int j = 1; j <= 9; j++) {
				System.out.println(numder + "*" + j + " = " + (numder * j));

			}
			numder++;
		}
	}

	public void practice10() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int numder = sc.nextInt();
		boolean logic = true;
		while (logic) {
			for (int i = 1; numder < 10; i++) {
				System.out.println("==== " + numder + " 단 ====");
				for (int j = 1; j < 10; j++) {
					System.out.println(numder + "*" + j + " = " + (numder * j));
				}
				numder++;
				logic = false;

			}
			if (numder > 9 && logic != false) {
				System.out.println("9 이하의 숫자만 입력해주세요.");
				logic = false;
			}
		}
	}

	public void practice11() {
		/*
		 * 1. 숫자와 공차를 입력받는다. 2. 공차에 입력한 값으로 입력받은 숫자에서 빼거나 더한다. 3. 출력되는 숫자는 총 10개이다.
		 */
		Scanner sc = new Scanner(System.in);
		// 1. 숫자와 공차를 입력받기
		System.out.print("시작 숫자 : ");
		int number = sc.nextInt();
		System.out.print("공차 : ");
		int gap = sc.nextInt();

		for (int i = 1; i <= 10; i++) {
			System.out.print(number + " ");
			number += gap;

		}

	}

	public void practice12() {
		/*
		 * 1.정수 두개와 연산자자를 입력받자 연산자값에exit가 들어올때 까지 무한반복 exit가들어온다면 프로그램종료 출력후 종료 연산자가 나누기
		 * 면서 두번째정수가 0이면 0으로나눌수없다 출력 없는연산자 나올시 다시입력해주세요 출력 두경우 처음으로 돌아가 연산자부터다시시작
		 */

		String exit = "exit";
		while (true) {
			boolean flag = true;

			Scanner sc = new Scanner(System.in);
			System.out.print("연산자(+,-,*,/,%) : ");
			String msg = sc.next();

			if (!msg.equals(exit)) {
				System.out.print("정수1 : ");
				int firstNumber = sc.nextInt();
				System.out.print("정수2 : ");
				int secondNumber = sc.nextInt();

				if (msg.equals("/") && (secondNumber == 0)) {
					System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요");
				} else {
					switch (msg) {

					case "+":
						System.out.println(
								" " + firstNumber + msg + secondNumber + " " + " = " + (firstNumber + secondNumber));
						flag = false;
						break;

					case "-":
						System.out.println(
								" " + firstNumber + msg + secondNumber + " " + " = " + (firstNumber - secondNumber));
						flag = false;
						break;

//					case "exit":
//						System.out.println("프로그램을 종료합니다.");
//						flag = true;
//						break;

					default:
						System.out.println("없는 연산자입니다. 다시 입력해주세요.");
						break;
					}
				}

			}

			if ((flag == true) && msg.equals(exit)) {
				System.out.println("프로그램을 종료합니다.");
				flag = false;
			}

			if(flag == false) {
				break;
			}
			//break;어렵다..
		}

	}

}