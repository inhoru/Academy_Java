package com.obj.run;

import com.obj.model.vo.GetterSetter;

public class GetterSettetMain {

	public static void main(String[] args) {
		
		GetterSetter g = new GetterSetter() {};
		for(int i = 1;i<=1;i++) {
		g.setName("유병승");
		g.setDepartment("강사부");
		g.setPosition("강사");
		g.setSalary(100);
		g.setBonus(0.5);
		System.out.println(i+g.inforEmp());
		g.setName("은세계");
		g.setDepartment("학생부");
		g.setPosition("학생");
		g.setSalary(10);
		g.setBonus(0.2);
		System.out.println(i+g.inforEmp());
		g.setName("황지윤");
		g.setDepartment("학생부");
		g.setPosition("학생");
		g.setSalary(10);
		g.setBonus(0.1);
		System.out.println(i+g.inforEmp());
		}
	}

}
