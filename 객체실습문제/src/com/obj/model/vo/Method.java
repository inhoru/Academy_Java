package com.obj.model.vo;

import java.util.Scanner;

public class Method {
	public Method() {}
	public String complexmsg(String msg,String msg1) {
			
		return msg+msg1;
	}
	public int complexNumber(int num,int num1) {
		if(num<num1) {
			System.out.println("계산할 수 없습니다.");
			return 0;
		}
		return num+num1;
	}
	
	public boolean english(char ch) {
		if('a'<=ch&&ch<='z'||'A'<=ch&&ch<='Z') {
			return true;
		}
		
		return false;
	}
	public boolean comparison() {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		String msg = sc.next();
		System.out.print("입력 : ");
		String msg1 = sc.next();
		if(msg.equals(msg1)) {
			return true;
		}
		
		return false;
	}

}
