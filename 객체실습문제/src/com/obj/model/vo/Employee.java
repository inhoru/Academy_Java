package com.obj.model.vo;

public class Employee {
	public String name;
	public String department;
	public int salary;
	public String number;
	public double bonus;

	public Employee(String name, String department, int salary, String number, double bonus) {
		this.name = name;
		this.department = department;
		this.salary = salary;
		this.number = number;
		this.bonus = bonus;
	}
}
