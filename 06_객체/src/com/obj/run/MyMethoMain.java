package com.obj.run;

import com.obj.basiccontroller.MyMethod;

public class MyMethoMain {
	public static void main(String[] args) {
		MyMethod mm = new MyMethod();//기본생성자
		mm.Msg();
		int result = mm.number();
		System.out.println(result);
		
//		String sumMsg =mm.printMsgSum();
//		System.out.println(sumMsg);
		//위방법과 아래방법 둘다가능
		System.out.println(mm.printMsgSum());
		
		mm.calculator(10, 20, '*');
		
		double result1 = mm.calculator2(10, 20, '*');
		System.out.println(result1);
//		if(mm.calculator2(10, 20, '*')<100) {
//			
//		}
		
		boolean flag = mm.checkStr("apple");
		if(mm.checkStr("apple")) {
			System.out.println("중복값이 있습니다.");
		}else {
			System.out.println("중복값이 없습니다.");
		}
		
	}
}
