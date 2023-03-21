package com.inter.common;
@FunctionalInterface
//평선 인터페이스는 하나만 존재해야한다.
public interface CalculatorInterface {
	void calc(int su, int su2);
	//하나만존재해야함 안그러면오류가남
	//int calc2(int a, int b);

}
