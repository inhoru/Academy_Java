package com.inter.common;

public interface BasicInter {
	//인터페이스 내부에는 추상메소드만 선언이 가능.
//	public void test() {
//		System.out.println("하하하 메소드 선언하기");
//		
//	}
	//abstract메소드는 구현부가없다.
	public abstract void test();
	//메소드선언부는 무조건 추상메소드이기 때문에 public abstract 예약어는 생략이 가능
	int calc(int a, int b);//public abstract int calc(int a,int b);랑똑같다.
	
	//인터페이스에 변수는 public final static 으로 선언된 변수만 가능하다.
	public static final int AGE=19;
	String NAME="유병승";
	
	
	
}
