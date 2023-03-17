package com.bs.variable;

public class VariableTest {
	public static void main(String[] args) {
		//변수에 값 대입(저장)하기
		int age;
		age=19;
		//변수의 값을 출력하기
		//age변수의 값(저장된)을 출력해라
		System.out.println(age);
		//변수값을 저장할때는 변수의 자료형과 리터럴의 자료형이 같아야한다.
		//age=3.14;
		
		//문자, 문자열 저장하기
		char alpha;
		alpha='A';
		System.out.println(alpha);
		String address;
		address="경기도 시흥시";
		System.out.println(address);
		
		//실수저장하기
		float height;
		height=180.5f;
		System.out.println(height);
		double weight;
		weight=65.5;
		System.out.println(weight);
		
		//변수는 한개값만 저장이 가능하다.
		age=50;
		System.out.println(age);
		
		//
		//변수에 값을 대입하기 위해서는 반드시 먼저 선언이 되어있어야 한다.
//		name="유병승";
//		String name;
		
		long account;
		account=3000000000L;
		
		//변수는 선언과 동시에 값을 대입할 수 있다.
		String email="teacherdev09@gmail.com";
		System.out.println(email);
		
		int a=100,b=200,c=300;
//		a=100;
//		b=200;
//		c=300;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		byte bnum;
		bnum=100;//java에서 byte, short 리터럴에 타입표시를 하지 않아도 
		//자동으로 리터럴 자료형을 변환하여 대입해줌.
		System.out.println(bnum);
		short snum=500;
		//bnum=128;
		
		
		//상수 : 선언된 저장공간에 한번만 값을 대입할 수 있는 것
		// 대입 후 수정은 불가능함.
		//에러코드, 지정된 레벨저장할때 사용
		final int AGE;
		//final String ADMIN_NAME;
		AGE=19;
		System.out.println(AGE);
//		AGE=50;
		
		
		
		
	}
}






