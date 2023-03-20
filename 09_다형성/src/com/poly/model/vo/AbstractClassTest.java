package com.poly.model.vo;
//추상클래스
//일반클래스와 동일하게 선언할 수 있다. -> 필드, 메소드, 생성자 모두 선언가능
//추상클래스는 생성이 불가능함. -> 추상클래스를 기본적으로는 이용할 수없다.
//무조건 상속 받아서 이용한다.
public abstract class AbstractClassTest {
	private String title;
	private String writer;
	
	public AbstractClassTest() {
		// TODO Auto-generated constructor stub
	}

	public AbstractClassTest(String title, String writer) {
		super();
		this.title = title;
		this.writer = writer;
	}
	public void testPrint() {
		System.out.println("추상클래스 메소드");
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}
	

}
