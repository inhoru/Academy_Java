package com.bs.controller;

import java.util.List;
import java.util.Map;

import com.bs.model.dto.Department;
import com.bs.model.dto.Employee;
import com.bs.model.dto.Job;
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
	public void departmentInsert() {
		Department d = view.departmentInsert();
		int result = service.departmentInsert(d);
		view.printMsg(result>0?"등록성공":"등록실패");
	}
	public void departmentUpdate() {
	    Map m = view.departmentUpdate();
	    int result = service.departmentUpdate(m);
	    view.printMsg(result>0?"수정성공":"수정실패");
	}
	public void departmentRemove() {
		String s = view.departmentRemove();
		int result = service.departmentRemove(s);
		view.printMsg(result>0?"삭제성공":"삭제실패");
	}
	public void inputdJob() {
		Job j=view.insertJob();
		int result=service.insertJob(j);
		new MainView().printMsg(result>0?"등록성공" : "등록실패");
	}
	
	public void updateJob() {
		Job j=view.updateJob();
		int result=service.updateJob(j);
		new MainView().printMsg(result>0?"수정성공" : "수정실패");
	}
	
	public void deleteJob() {
		Job jobName=view.deleteJob();
		int result=service.deleteJob(jobName);
		new MainView().printMsg(result>0?"삭제성공" : "삭제실패");
	}
}