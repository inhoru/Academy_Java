package com.array.controller;

public class ArrayController {
	public void basicArray() {
		//기본배열 활용하기
		//배열은 기본으로 제공되는 저장공간으로 생성(new)해서 사용을 한다.
		//배열의 저장구조는 선형구조임.
		//저장순서가 있고 저장소을 지칭하는 번호(인덱스)를 가진다.
		//배열 선언하기
		//배열 자료형-> 기본자료형[]
		int[] intArr;//배열을 저장할 수 있는 변수를 선언
		//intArr=10;안돼!!
		//원하는 크기만큼의 배열을 생성해서 할당을 해야한다.
		//배열생성하기 -> new연산자를 이용해서 생성!
		//new 자료형[원하는갯수(길이)]
		intArr=new int[3];
		//기본으로 생성했을때 각 저장소는 자료형의 기본값으로 초기화된다.
		//정수형(byte,short,int,long) : 0
		//실수형(float,double) : 0.0
		//문자열(String) : null
		//문자(char) : ' '
		
		//int a=0;
		//배열생성 후 각 저장공간활용하려면
		//인덱스번호로 각 저장공간을 불러올 수 있다.
		//인덱스번호는 선언한 길이에-1한 번호까지
		System.out.println(intArr[0]);
		System.out.println(intArr[1]);
		System.out.println(intArr[2]);
		//초과한 인덱스번호를 호출하면????? 에러가 발생함.
		//System.out.println(intArr[3]);
		//String a=100;
			
		//System.out.println(a);
		//배열에 값 저장하기
		intArr[0]=1;
		intArr[1]=200;
		intArr[2]=-5;
		
		System.out.println(intArr[0]);
		System.out.println(intArr[1]);
		System.out.println(intArr[2]);
		
		//친구이름 저장하기
		//친구 3명의 이름을 저장하는 배열을 만들고
		//자신의 스터디원을 저장 후 출력하기
		String[] names;
		names=new String[2];
		names[0]="김재훈";
		names[1]="외롭다..";
		//names[2]="인생은혼자지..은따인가...";
		System.out.println(names[0]);
		System.out.println(names[1]);
		//System.out.println(names[2]);
		names[0].length();
		names[0].charAt(0);
//		String name="유병승";
//		name.length();
		
		//for문과 같이 배열이용하기
		for(int i=0;i<3;i++) {
			System.out.println(intArr[i]);
		}
		//for문 이용해서 이름출력하기
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]);
		}
		//배열에서 저장소의 길이를 제공하는 변수가 있음.
		//배열변수명.length;
		System.out.println(intArr.length);
		System.out.println(names.length);
		
		
	}
}
