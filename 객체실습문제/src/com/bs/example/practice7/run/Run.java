package com.bs.example.practice7.run;

import com.bs.example.practice7.model.vo.Employee;

public class Run {

	public static void main(String[] args) {

		Employee e = new Employee();
		
		e.setEmpNo(100);
		e.setEmpName("홍길동");
		e.setDept("영업부");
		e.setJob("과장");
		e.setAge(25);
		e.setGender('남');
		e.setSalary(2500000);
		e.setBonusPoint(0.05);
		e.setPhone("010-1234-5678");
		e.setAddress("서울시 강남구");
		
		
		System.out.println(e.getEmpNo() + " " + e.getEmpName() + " " + e.getDept() + " " + e.getJob() + " " + e.getAge()
		+ " " + e.getGender() + " " + e.getSalary() + " " + e.getBonusPoint() + " " + e.getPhone() + " "
		+ e.getAddress());
	}

}
