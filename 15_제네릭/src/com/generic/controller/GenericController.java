package com.generic.controller;

import java.util.ArrayList;
import java.util.Date;

import com.generic.model.vo.GenericBasic;
import com.generic.model.vo.GenericInterface;

public class GenericController {

	public static void main(String[] args) {
		//제네릭에 대해 알아보자.
		//자바에서 동적타입을 선언하는 구문
		//<자료형>으로 제네릭으로 선언된 자료형을 결정
		
		//제네릭으로 선언된 클래스 이용하기
		GenericBasic<String,Date> gb=new GenericBasic();
		gb.setData("유병승");
		System.out.println(gb.getData());
		//gb.setData(19); String 로 선언햇기때문에 문자열만가능
		GenericBasic<Integer,Math> gb1=new GenericBasic();
		gb1.setData(19);
		System.out.println(gb1.getData());
		
		//밑부분 다시듣기 이게뭔소리임?
		GenericInterface<String, String> stringFilter = (e,v)->e.equals(v);
		stringFilter.check("dfds","Dfd");
		GenericInterface<GenericBasic<String[] ,Date>,String> filter = (e,v)->e.equals(v);
		filter.check(new GenericBasic<>(),"sada");
		
		//ArrayList에 제네릭타입선언 후 이용하기
		ArrayList<String> names = new ArrayList();
//		names.add(10);
//		names.add(true);
		names.add("유병승");
		names.add("강민기");
		for(String s : names) {
			System.out.println(s);
		}
		
		
	
		
		
	}

}
