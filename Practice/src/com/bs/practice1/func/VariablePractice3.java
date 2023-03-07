package com.bs.practice1.func;

import java.util.Scanner;

public class VariablePractice3 {
	public void area() {
		Scanner sc = new Scanner(System.in);
		System.out.print("가로 :");
		double width = sc.nextDouble();
		System.out.print("세로 :");
		double vertical = sc.nextDouble();
		System.out.println("면적 :" + width*vertical);
		System.out.println("둘레 :" + (width+vertical)*2);
		
		
	}

}
