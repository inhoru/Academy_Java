package com.generic.model.vo;

public class GenericBasic<T,E>{
	//제네릭표시 클래스 에<T>를 넣는다.
	//생성할때 타입을결정을한다.
	//int가될수도있고 String이될수도있다 아무거나될수가있다.
	//T는 기본자료형
	//E는 객체
	
	private T data;
	private E element;
	
	public GenericBasic() {
	}
	public GenericBasic(T data) {
		this.data=data;
	}
	public T getData() {
		return this.data;
		
	}
	public void setData(T data) {
		this.data=data;
	}
}
