package com.inherit.run;

import com.inherit.controller.InheritController;
import com.inherit.model.vo.FinalTestClass;

public class Main {

	public static void main(String[] args) {
		// new InheritController().basicInheritTest();
		 new InheritController().overrideTest();
		 
		 FinalTestClass ftc= new FinalTestClass();
		 
		 ftc.setTest("사용문제없음");
		 System.out.println(ftc.getTest());
	}
	

}
