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
		System.out.print("1 이상의 숫자를 입력하세요 : ");
		int su = 0;
		do {
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

}
