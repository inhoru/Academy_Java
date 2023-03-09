package com.array.controller;

import java.util.Scanner;

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
		
		//반복문을 이용해서 배열을 초기화하기
		//int 배열을 10개를 할당하고 각 저장공간에 1~10까지 수를 대입하기
		int[] number = new int[10];
		for(int i =0;i<number.length;i++) {
			number[i]=i+1;//i++<-이녀석은 i값자체를 바꾼다 i+1은 연산결과만바꾼다
			
		}
		for(int i = 0;i<number.length;i++) {
			System.out.println(number[i]);
		}
		
		//학생 5명의 키를 입력받아 저장하는 기능 구현하기
		//저장 후 출력하기
//		Scanner sc = new Scanner(System.in);
//		double [] student = new double[5];//더블형공간5개생성 
//		for(int i =0;i<student.length;i++) {
//			System.out.print((i+1) +"번학생 키 입력 : ");
//			//double height = sc.nextDouble();
//			student[i]= sc.nextDouble();//이미 위에서 더블로선언햇기때문에 따로할필요가없다.
//		}
//		for(int i= 0;i<student.length;i++) {
//			System.out.println((i+1) +"번학생 키 :"+student[i]);
//			
//		}
		
		//배열선언시에 대입할 값이 정해져있다면
		//배열선언과 동시에 값을 초기화할 수 있다.
		char [] alpha = {'a','b','c','d','e'};
		for(int i=0;i<alpha.length;i++) {
			System.out.println(i +" "+ alpha[i]);
		}
		char[] alpha2 =new char[] {'A','B','C','D',};
		for(int i =0  ;i<alpha2.length;i++) {
			System.out.println(i+" "+ alpha2[i]);
		}
		//alpha = {'가','나','다}; <-이렇게되어있는 부분은 반드시선언과동시에 초기화 라인안에서 해야한다.
		alpha = new char [] {'가','나','다'};//선언한구문은 다시 선언할려면 new를써야한다이렇게 써야 사용가능하다 
		
		}
		
		
		
		
	
}
