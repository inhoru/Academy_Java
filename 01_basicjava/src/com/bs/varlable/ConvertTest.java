package com.bs.varlable;

public class ConvertTest {
	public static void main(String[] args) {
		//형변환에 대해 알아보자
		//특정연산을 실행할때는 피연사자의 타입이 동일해야한다.
		int num = 100;
		long lnum = num;//long는8바이트 num은4바이트 자동으로형변환해서 들어감
		System.out.println(10 + 180.5);//int타입 10을 자동형변환으로 10.0으로바꿔준다.
		float fnum = lnum;
		System.out.println(fnum);
		
		//강제형변환
		int num2 = (int) 180.5;
		System.out.println(num2);
		
		int test = 290;
		byte bnum = (byte) test;//byte는 127까지밖에 포현못한다. 그래서 데이터가날라간다.
		System.out.println(bnum);
		
		//계산에서 강제적 형변환
		//성적, 평균
		int kor = 90, eng = 54, math = 49;//나누기연산을할때 하나를 더블로바꾼다.
		System.out.println((kor +  eng +  math) / (double) 3.0); //인트끼리연산하면 인트만나온다 그래서하나를 더블로바꿔서 소수로바꾼다.
		
		//단일문자(char) 형변환
		//char 내부적으로 코드표에 있는 숫자를 저장
		char ch = 'A';//A는 유니코드표에서 65다.
		int chint = ch;
		System.out.println(chint);
		chint = 66;//내부적으로 B라는 코드값으로변경
		System.out.println((char)chint);
		ch++; //(ch+1)
		System.out.println(ch);
		
		for(int i=0; i<10; i++) {
			System.out.println(ch++);
			
			
			
			
			
		}
		
		
		
	}
}
