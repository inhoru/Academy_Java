package com.obj.model.vo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class InitblockTest {
	//초기화블록 테스트하기
	public String test;
	public int testnum;
	
	//초기화블록 선언하기
	{
		System.out.println("InitblockTest클래스 생성!!");
		test="야구화이팅!";
		testnum=200;
		//조건문,반복문을 사용할 수 있음.
		int count = 0;
		for(int i =1;i<=10;i++) {
			count+=i;
			
		}
		if(test.charAt(0)=='야') {
			test+="이긴다";
		}
		
		testnum+=count;
		
		Date today=new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("YYYYMMdy");
		sdf.format(today);
		test=sdf.format(today)+(int) (Math.random()*10000)+1;
		
	}
}
