package com.inherit.model.vo;

public class OverrideChild extends OverrideParent {
	//override는 메소드선언부를 부모에 선언된 메소드와 동일하게
	//선언해야한다. 
//	public void printMsg(String msg) {//매게변수가생기면 안된다 선언부가 전부 똑같아야한다.
//		System.out.println("Override child");
//		
//	}
//	//메소드 오버라이드를 할때는 어노테이션으로 표시해서 관리를 한다.
	//어노테이션 : @어노테이션명
	@Override//Override가 맞는지 확인 -> 선언한 메소드가 부모클래스에 있는지확인
	//오버라이드어노테이션을 안써도되지만 헷갈릴수있다 오버라이드쓸거면 어노테이션 오버라이드를 사용하자.
	public void printMsg() {
		System.out.println("어노테이션으로 오버라이드");
	}
	
}
