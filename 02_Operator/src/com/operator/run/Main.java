package com.operator.run;

import com.operator.controller.OperatorController;//패키지이름,클래스파일이름
// 프로젝트를 실행하는 기능을 하는 Main 클래스 -> main메소드를 갖는다.
public class Main {
	public static void main(String[] args) {
		//new OperatorController().singleOp(); //다른패키지에있는걸 써야하기에 imp
		//new OperatorController().calculatorOp();//voide이다
		//new OperatorController().calc();
		//new OperatorController().compareOp();
		//new OperatorController().testStr();
		//new OperatorController().check();
		//new OperatorController().logicOp();
		//new OperatorController().complexOp();
		//new OperatorController().calcGrade();
		//new OperatorController().inputMsg();
		new OperatorController().thirdOp();
	}

}
