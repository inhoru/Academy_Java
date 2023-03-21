package com.inter.common;
//ParentInterface 상속받기
public interface ChildInterface extends ParentInterface, Flyable {
	
	void printTest(String str);
}
