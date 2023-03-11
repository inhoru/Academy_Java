package com.test;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		int[][] intArr1 = new int[3][3];
		for (int i = 0; i < intArr1.length; i++) {
			for (int j = 0; j < intArr1[i].length; j++) {
				intArr1[i][j] = j + 1;

			
			}
		}
		// 출력기능 을 따로만들기
		for (int i = 0; i < intArr1.length; i++) {
			for (int j = 0; j < intArr1[i].length; j++) {
				System.out.print(intArr1[i][j]);
			}
			System.out.println();
		}
	}

}
