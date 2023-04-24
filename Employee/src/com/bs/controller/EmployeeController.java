package com.bs.controller;

import java.util.List;
import java.util.Map;

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
	public void selectSearchEmployee() {
		Map param = view.inputSearch();
		List<Employee> employee = service.searchEmployee(param);
		view.printMembers(employee);
	}
	public void insertEmployee() {
		Employee e = view.addEmployee();
		int result = service.insertEmployee(e);
		view.printMsg(result>0?"등록성공":"등록실패");
	}
	public void updateEmployee() {
		Employee e = view.updateEmployee();
		int result = service.updateEmployee(e);
		view.printMsg(result>0?"수정성공":"수정실패");
		
	}
	public void removeEmployee() {
		int inputId = view.removeEmployee();
		int m = service.removeEmployee(inputId);
		view.printMsg(m>0?"회원삭제 성공":"회원삭제 실패");
	}
	public void deptManagement() {
		
		Map param = view.deptManagement();
		int result = service.deptManagement(param);
		view.printMsg(result>0?"성공":"실패");
	}
}
