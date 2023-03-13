package com.obj.model.vo;

public class Animal {
	//매개변수있는 생성자 이용하기
	//동물정보를 저장할 수 있는 클래스 만들기 
	//종류, 이름,몸무게,길이,서식지
	//개 뽀삐 5kg 50cm 우리집
	//고양이 야옹이3kg 40cm 짬통
	//거북이 꼬북이 1.2kg 5cm 어항속
	//객체를 생성할때 모든값이 세팅되어서 생성될 수 있게 하고
	//해당내용 출력하기
	public String type;
	public String name;
	public double weight;
	public int length ;
	public String home;
	
	
	public Animal() {}//기본생성자
	
	public Animal(String paramType,String paramName,
			double paramWeight,int paramLength,String paramHome) {
		
		//만약 이름이같다면 앞에this.를붙여줘야한다.
		type=paramType;
		name=paramName;
		weight=paramWeight;
		length=paramLength;
		home=paramHome;
		
		
		
	}
	
	
	
}
