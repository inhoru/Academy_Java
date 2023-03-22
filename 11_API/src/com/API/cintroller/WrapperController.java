package com.API.cintroller;

import java.awt.PrintGraphics;

public class WrapperController {

	public static void main(String[] args) {
		//Wrapper클래스 이용하기
		//기본자료형을 객체로 사용할 수 있게 해주는 클래스
		//자동처리됨 (autoBoxing,autoUnBoxing)
		//int -> Integer 맵핑
		//double -> Double 맵핑
		//long - > Long 맵핑
		//boolean -> Boolean 맵핑
		//char -> Character 맵핑
		
		//원래들어갈수없다 obj는참조형자료형이기때문이다 하지만 어쩌구저쩌구 강의다시보기
		Object obj = 10; 
		//객체를 대상으로하는 저장소에도 기본자료형을 저장할수있도록 해준다.
		Integer age = 19;
		int intAge=age;
		System.out.println(age);
		System.out.println(intAge);
		
		//자동으로 변환되서 들어감 이게Wrapper클래스다
		test(19); 
		test(180.5);
		test(true);
		test('a');
		int test = getInt();
		System.out.println(test);
		
		
		//문자열을 기본타입으로 변경하는 메소드를 제공
		//wrapper클래스
		//parse자료형("문자열")
		String test2 = "20";
		int change = Integer.parseInt(test2);
		System.out.println(change);
		//출력결과
		//20
		
		//둘중의 큰값을 반환
		int result =Integer.max(100,200);
		System.out.println(result);
		//출력결과
		//200
		
		//둘중의 작은값을 반환
		result = Integer.min(100, 200);
		System.out.println(result);
		//출력결과
		//100
	}
	public static void test( Object o ) {
		System.out.println(o);
	}
	//반환형도가능
	public static Integer getInt() {
		return 10;
	}
}
