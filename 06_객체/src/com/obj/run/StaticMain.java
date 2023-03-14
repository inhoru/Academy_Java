package com.obj.run;

import com.obj.model.vo.StaticTest;

public class StaticMain {
	public static void main(String[] args) {
		//static 예약어 대해 알아보자
		//필드, 메소드, 초기화블록에 사용할 수 있다.
		//static 으로 선언된 필드에 접근하려면
		//선언된 클래스명을 이용해서 접근을 해야한다.
		
		StaticTest.test = "접근되니?";
		System.out.println(StaticTest.test);

		StaticTest st = new StaticTest();
		//st.test="생성된 객체로 접근";
		//경고가뜬다 스태틱필드는 스태틱방식으로접근해
		StaticTest.test="생성된 객체로 접근";
		
		//static으로 선언된 메소드 실행하기.
		StaticTest.testMethod();
		//Math.random();<-이것도 스태틱
		
		new StaticTest();
		//static으로 선언된 필드, 메소드도 접근제한자의 영향을 받는다.
		//static 필드는 접근제한자를 private 으로 선언한다.
		//StaticTest.count=100;
		//지금현재 겟이랑 셋은 멤버메소드로 있으니간
		//뉴를 써서 생성을해야 사용이가능하다
		//new를 붙인
		//new StaticTest().setCount(100);
		//System.out.println(new StaticTest().getCount());
		StaticTest.setCount(100);		
		System.out.println(StaticTest.getCount());
		
		
	}
}
