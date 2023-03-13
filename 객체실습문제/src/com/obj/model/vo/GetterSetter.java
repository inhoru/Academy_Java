package com.obj.model.vo;

public class GetterSetter {
	private int empNo;
	private String name;
	private String department;
	private String position;
	private int salary;
	private double bonus;
	
	

	public GetterSetter() {
		
	}
	public String inforEmp() {
		return this.empNo + " " + this.name + " " +
	this.department + " " +this.position+ " "+ this.salary + " " + this.bonus;
	}
	

	public int getEmpNo() {
		return this.empNo;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDepartment() {
		return this.department;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getPosition() {
		return this.position;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getSalary() {
		return this.salary;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public double getBonus() {
		return this.bonus;

	}

}
