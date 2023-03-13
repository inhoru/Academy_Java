package com.obj.run;

import com.obj.model.vo.Method;

public class MethodMain {

	public static void main(String[] args) {
		Method m = new Method();
		String msg = m.complexmsg("하나","두개");
		System.out.println(msg);
		
		int num = m.complexNumber(5, 7);
		System.out.println(num);
		
		
		boolean ch = m.english('A');
		System.out.println(ch);
		
		boolean flag= m.comparison();
		System.out.println(flag);
		
	}

}
