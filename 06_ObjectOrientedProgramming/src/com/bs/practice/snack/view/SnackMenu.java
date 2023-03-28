package com.bs.practice.snack.view;

import java.util.Scanner;

import com.bs.practice.snack.controller.SnackController;

public class SnackMenu {
	private Scanner sc = new Scanner(System.in);
	private SnackController s = new SnackController();
	
	public void menu() {
		System.out.println("스낵류를 입력하세요.");
		System.out.print("종류 : ");
		String kind=sc.nextLine();
		System.out.print("이름 : ");
		String name=sc.nextLine();
		System.out.print("맛 : ");
		String flavor=sc.nextLine();
		System.out.print("개수 : ");
		int numOf=sc.nextInt();
		System.out.print("가격 : ");
		int price=sc.nextInt();
		s.saveData(kind, name, flavor, numOf, price);
		System.out.println("저장이 완료되었습니다.");
		System.out.println("저장한 정보를 확인하시겠습니까?(y/n)");
		char choi = sc.next().charAt(0);
		if(choi=='y') {
		System.out.println(s.confirmData());	
			
		}
	}
}
