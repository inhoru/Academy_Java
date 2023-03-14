package com.obj.run;

import com.obj.model.vo.GetterSetter;

public class GetterSettetMain {

	public static void main(String[] args) {
		
		GetterSetter g = new GetterSetter();
		g.setName("유병승");
		g.setDepartment("강사부");
		g.setPosition("강사");
		g.setSalary(100);
		g.setBonus(0.5);
		GetterSetter s = new GetterSetter();
		s.setName("은세계");
		s.setDepartment("학생부");
		s.setPosition("학생");
		s.setSalary(10);
		s.setBonus(0.2);
		GetterSetter h = new GetterSetter();
		h.setName("황지윤");
		h.setDepartment("학생부");
		h.setPosition("학생");
		h.setSalary(10);
		h.setBonus(0.1);
		System.out.println(g.inforEmp());
		System.out.println(s.inforEmp());
		System.out.println(h.inforEmp());
		
	}

}
