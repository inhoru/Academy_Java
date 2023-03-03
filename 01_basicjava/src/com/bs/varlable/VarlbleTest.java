package com.bs.varlable;

public class VarlbleTest {
	public static void main(String[] args) {
		//변수에 값 대입하기(저장)하기
		int age;
		age=19;
		System.out.println(age);//age(저장된값)변수의값을출력해라
		//변수의값을 저장할때 변수의 자료형과 리터럴(값그자체) 같아야한다.
		
		//문자, 문자열 저장하기
		char alpha;
		alpha = 'A';
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
		age = 50;
		System.out.println(age);
		
		//변수에 값을 대입하기 위해서 반드시 먼저 선언이 되어있어야 한다.
//		name = "유병승";
//		String name; 불가능하다 변수선언이뒤에있으면
		
		long account;
		account=3000000000L;
		
		
		//변수는 선언과 동시에 값을 대입할 수 있다.
		String email = "inhoru126@gmail.com";
		System.out.println(email);
		
		int a = 100,b = 200,c = 300;
//		a=100;
//		b=200;
//		c=300;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		//Java에서byte와short는 리터럴에 타입표시를 하지않아도
		//자동으로 리터럴 자료형을 변환하여 대입해줌.
		byte bnum;
		bnum = 100;
		System.out.println(bnum);
		bnum=127;//바이트가표현할수잇는 범위를 넘어서 자동변환 불가 127까지인데 128불가능
		
		//상수 : 선언된 저장공간에 한번만 값을 대입할 수 있는 것
		// 대입 후 수정은 불가능함.
		// 에러코드, 지정된 레벨저장할때 사용
		//명칭할때  대문자로 작성
		//여러단어가있을때는 언더바를쓴다.
		final int AGE;
		//final String ADMIN_NAME;
		AGE = 19;
		System.out.println(AGE);
		//AGE = 50; 값변경불가능
		
		
		System.out.println(2*11234564*45464564);
		System.out.println(2*75564464*754564564);
		System.out.println(2*9665454*415615644);
	
		
	}
}
