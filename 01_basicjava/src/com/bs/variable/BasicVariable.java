package com.bs.variable;

public class BasicVariable {
	public static void main(String[] args) {
		//변수선언하기
		//각 자료형별 변수를 선언해보자.
		
		//1. 논리형 : true, false데이터를 저장하는 저장공간
		// 크기 : 1byte
		// 명칭 : boolean
		boolean flag;
		
		//2. 숫자형 변수 선언
		// 정수형
		//	byte : 1byte, short : 2byte, int : 4byte, long : 8byte
		// 숫자값을 저장할때는 일반적으로 int형을 많이 사용함.
		byte bnum;//byte[] 바이너리파일을 저장할때 사용(사진, 동영상, 음악...)
		short snum;
		int inum;//일반적인 숫자값을 저장할때 사용
		long lnum;//int넘어서는 값을 저장할때 사용
		// 실수형 *실제값이 아닌 계산에 필요한 값을 저장(지수, 가수)
		//float : 4byte크기의 실수를 저장
		//double : 8byte크기의 실수를 저장
		float fnum;
		double dnum;
		
		//문자, 문자열 -> 코드표에 있는 숫자로 저장이 된다.
		//char : 단일문자를 저장할때 사용(한개 문자)
		//String : 문자열을 저장할때 사용(단어, 문자)
		char ch;
		String str;
		
		//1. 변수명은 대소문자를 구분한다. 명칭에 길이에는 제한이없다.
		int testNum;
		int testnum;
		double testtesttesttesttesttesttesttesttesttesttesttesttesttesttest;
		//2. 예약어를 변수명으로 사용할 수 없다.
		//char public;
//		char if;
		//3. 변수명의 첫글자를 숫자로 사용할 수 없다.
		//boolean 1flag;
		boolean flag1;
		boolean f1lag;
		//4. 변수명에 특수기호는 _, $만 사용이 가능하다.
		byte _test;
		byte $test;
		//byte #test;
		byte t_est;
		byte tes$t;
		
		//5. 동일영역({}안)내부에서 변수명은 중복될 수 없다.
		//String t_est;
//		if(t_est) {
//			int tes$t;
//		}
		
		//변수선언할때 동일자료형에 대한 여러변수를 한번에 선언
//		int a;
//		int b;
//		int c;
//		int d;
//		int e;
		int a,b,c,d,e;
		
		
		
		
		
		
		
	}//main 닫기
	String t_est;
}
