package com.obj.run;

import com.obj.model.vo.Method;

public class MethodMain {

	public static void main(String[] args) {
		Method m = new Method();
		System.out.println( m.complexmsg("하나","두개"));
		
		System.out.println(m.complexNumber(10, 1));
		
		
		System.out.println(m.english('z'));
		
		System.out.println(m.comparison());
		
	}

}
