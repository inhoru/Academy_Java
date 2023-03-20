package com.poly.run;

import java.util.Scanner;

import com.poly.controller.GameController;
import com.poly.model.vo.Archer;
import com.poly.model.vo.Wariror;
import com.poly.model.vo.Wizard;

public class CharacterMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("==== BS의 전설 =====");
		System.out.println("캐릭터선택");
		System.out.println("1. 전사");
		System.out.println("2. 마법사");
		System.out.println("3. 궁수");
		int choice = sc.nextInt();
		GameController gc;
		switch(choice) {
		case 1 : gc = new GameController(new Wariror(100,1,"최주영",80));break;
		case 2 : gc = new GameController(new Wizard(50,1,"이동제",100,new String[] {"파이어볼","아이스어택","윈드스톰"}));break;
		case 3 : gc = new GameController(new Archer(80,1,"최인호",20));break;
		default : gc =new GameController(new Wariror());break;
		}
		while(true) {
			System.out.println("1. 공격하기");
			System.out.println("2. 방어하기");
			System.out.println("3. 정보보기");
			System.out.println("4. 종료하기");
			int ch = sc.nextInt();
			switch(ch) {
			case 1 : gc.attck();break;
			case 2 : gc.defence();break;
			case 3 : gc.printCharacter();break;
			case 4 : return;
			}
		}
		
	}

}
