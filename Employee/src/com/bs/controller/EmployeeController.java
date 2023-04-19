package com.bs.controller;

import java.util.List;

import com.bs.model.dto.Employee;
import com.bs.model.service.EmployeeService;
import com.bs.view.MainView;

public class EmployeeController {
	private EmployeeService service = new EmployeeService(); 
	private MainView view = new MainView();
	
	public void mainMenu() {
		view.mainMnue();
	}
	public void selectAllEmployee() {
		List<Employee> employees=service.selectAllEmployee();
		view.printMembers(employees);
	}
}
