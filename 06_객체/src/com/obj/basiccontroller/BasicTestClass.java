package com.obj.basiccontroller;


//접근제한자가 public으로 선언된 클래스는 프로젝트내 모든 패키지에서 이용가능
//이용가능 : new연산자로 객체화(생성) 해서 사용할 수 있다.
public class BasicTestClass {

	
	{
		//Default접근제한자가 선언된 클래스는
		//같은패키지안이기때문에사용가능하다.
		new DefaultTestClass();
		//같은패키지내에서 default접근제한자를 사사용한 필드에 
		//직접전근이 가능하다.
		FieldTestClass ftc = new FieldTestClass();
		System.out.println(ftc.name);
		ftc.name = "김아무";
		//System.out.println(ftc.gender);
	}
	
}
