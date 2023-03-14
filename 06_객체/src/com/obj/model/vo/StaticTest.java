package com.obj.model.vo;

public class StaticTest {
	//Static예약어를 사용한 필드는 클래스를 생성(객체화)하지않고 
	//사용할 수 있는 저장공간
	//어떨때 사용할까? 프로젝트내에서 공용으로 사용하는 저장공간이다
	
	public static String test;
	private static int count;
	private static final String ERROP_404;//="페이지없음";
	static {//조건이필요할때 조건,반복 사용가능 중괄호안이니깐
		ERROP_404="페이지가없음";
		
	}
	private String member;
	
	//메소드에 static 사용하기
	public static void testMethod() {
		System.out.println("static메소드");
		
	}
	//객체생성없이 쓸려고 스태틱을쓴건데 
	public static void setCount (int count) {
		StaticTest.count = count;
		//this.member = "김찬은"; 멤버변수는 스태틱메소드에서 이용불가능
		
	}
	public static int getCount () {
		return StaticTest.count;
	}
	public void memberMetho() {
		System.out.println("멤버메소드");
	}
	
}
