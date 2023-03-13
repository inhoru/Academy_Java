package com.obj.basiccontroller;

import java.util.Scanner;

public class MyMethod {
	
	public MyMethod() {}

	public void Msg() {
		System.out.println("월요일 점심 맛있게 먹어요");
	}

	public int number() {
		int result = 0;
		for (int i = 0; i < 5; i++) {
			result += i + 1;

		}
		return result;
	}

	public String printMsgSum() {
		Scanner sc = new Scanner(System.in);
		String sumMsg = "";
		for (int i = 0; i < 5; i++) {
			System.out.print(i + 1 + "입력 : ");
			sumMsg += sc.next();
		}
		return sumMsg;
	}
	
	public void calculator(int su, int su2, char op) {
		switch (op) {
		case '+':
			System.out.println("" + su + op + su2 + "" + "=" + (su + su2));
			break;
		case '-':
			System.out.println("" + su + op + su2 + "" + "=" + (su - su2));
			break;
		case '*':
			System.out.println("" + su + op + su2 + "" + "=" + (su * su2));
			break;
		case '/':
			System.out.println("" + su + op + su2 + "" + "=" + (su / su2));
			break;
		}
		
	}
	public double calculator2(int su, int su2, char op) {
//		double result =0.0;
//		switch (op) {
//		case '+':
//			result=(su + su2);break;
//		case '-':
//			result=(su - su2);break;
//		case '*':
//			result=(su * su2);break;
//		case '/':
//			result=(su / (double)su2);break;
//		}
//		return result;
		//밑에꺼 이해가안가니 설명다시듣고 풀기
		switch(op) {
			case '+' : return su+su2;
			case '-' : return su-su2;
			case '*' : return su*su2;
			case '/' : return su/(double)su2;
			//default : return 0;
		}
		return 0;
	}
	

	
	public boolean checkStr(String str) {
		
		for(int i =0;i<str.length();i++) {
			for(int j =0;j<i;j++) {
				if(str.charAt(i)==str.charAt(j)) {
					return true;
		//리턴이되면 그대로끝 중복되는 문자가나오는순간 true이기때문에 리턴을안에넣음
					//안나오면 밑으로내려가서 리턴에 false들어감
				}
			}
		}
		return false;
	}
		
	
	

}
