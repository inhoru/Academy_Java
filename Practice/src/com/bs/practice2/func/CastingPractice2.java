package com.bs.practice2.func;

import java.util.Scanner;

public class CastingPractice2 {
	public void grade() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		double su = sc.nextDouble();
		
		System.out.print("영어 : ");
		double su1 = sc.nextDouble();
		
		System.out.print("수학 : ");
		double su2 = sc.nextDouble();
		
		
		System.out.println("총점 : " + ((int)su+su1+su2) + "\n" + ((int)(su+su1+su2)/3));
		
	}
}
