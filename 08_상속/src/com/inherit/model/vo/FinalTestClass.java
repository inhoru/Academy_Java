package com.inherit.model.vo;
//상속이 불가능한 클래스
//하지만 사용은 하는건 문제없다.
public final class FinalTestClass {
	private String test;
	
	public void setTest(String test) {
		this.test=test;
	}
	public String getTest() {
		return test;
	}
}
