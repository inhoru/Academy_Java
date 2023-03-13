package com.obj.run;

import com.obj.model.vo.InitblockTest;

public class InitMain {

	public static void main(String[] args) {
		InitblockTest ibt=new InitblockTest();
	
		System.out.println(ibt.test);
		System.out.println(ibt.testnum);
		for(int i =0;i<5;i++) {
		InitblockTest t =new InitblockTest();
			System.out.println(t.test);
		}
	}

}
