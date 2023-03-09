package com.bs.practice.array;

import java.util.Scanner;

public class ArrayPractice {

	public void practice1() {

		int[] Arr = new int[10];
		for (int i = 0; i < Arr.length; i++) {
			Arr[i] = i + 1;
		}
		for (int i : Arr) {
			System.out.print(i + " ");
		}
	}

	public void practice2() {
		int[] Arr = new int[10];
		for (int i = 1; i <= Arr.length; i++) {
			Arr[10 - i] = i;

		}
		for (int i : Arr) {
			System.out.print(i + " ");
		}

	}

	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 : ");
		int num = sc.nextInt();
		int[] Arr = new int[num];
		for (int i = 0; i < Arr.length; i++) {
			Arr[i] = i + 1;
		}
		for (int i : Arr) {
			System.out.print(i + " ");
		}
	}

	public void practice4() {
		String[] Arr = { "사과", "귤", "포도", "복숭아", "참외" };
		String fruit = " ";
		for (int i = 0; i < Arr.length; i++) {

			if (Arr[i].equals("귤")) {
				System.out.println(Arr[i]);
				break;
			}
		}
	}

	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String msg = sc.next();
		System.out.print("문자 : ");
		char ch1 = sc.next().charAt(0);
		int count = 0;
		String index = "";

		char[] Arr = new char[msg.length()];// 렝쓰를 써야 문자열에갯수가나온다
		for (int i = 0; i < Arr.length; i++) {

			Arr[i] = msg.charAt(i);
		}
		for (int i = 0; i < Arr.length; i++) {
			if (Arr[i] == ch1) {
				count++;
				index += i + " ";
			}

		}

		System.out.println(msg + "에 " + ch1 + "가 존재하는 위치(인덱스) : " + index + "\n" + ch1 + " 개수 : " + count);

	}

	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.println("0~6 사이 숫자 입력 : ");
		int num = sc.nextInt();

		String[] week = { "월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일" };
		for (int i = 0; i < week.length; i++) {
			if (i == num) {
				System.out.println(week[i]);

			}
			if (num > 6 || num < 0) {
				System.out.println("잘못 입력하셨습니다.");
				break;

			}

		}

	}

	public void practice7() {
		/*
		 * 1. 배열의 길이 직접 작성 2.그 값만큼 정수형 배열 선언 및 할당 3.배열의 크기만큼 사용자가 직접 값을 입력하여 인덱스에 값을 초기화
		 * 4.배열 전체값을 나열하고 각 인덱스에 저장된 값들의 합을 출력
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int length = sc.nextInt();
		int[] Arr = new int[length];
		String msg = "";
		int result = 0;
		for (int i = 0; i < Arr.length; i++) {
			if (Arr[i] == Arr[i]) {
				System.out.print("배열" + i + "번째 인덱스에 넣을 값 : ");
				int num1 = sc.nextInt();
				msg += num1 + " ";
				Arr[i] += num1;
				result += Arr[i];
			}
		}
		System.out.println(msg + "\n" + "총합 : " + result);

	}//
	

}
