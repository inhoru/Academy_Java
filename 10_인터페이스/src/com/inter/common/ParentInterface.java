package com.inter.common;

public interface ParentInterface {
	int add(int su,int su2);
	
	String addStr(String str,String str2);
	
	default public void test() {
		System.out.println("default메소드 추가");
	}
}
