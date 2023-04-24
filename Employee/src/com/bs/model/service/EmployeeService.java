package com.bs.model.service;

import static com.bs.common.JDBCTemplate.*;



import java.sql.Connection;
import java.util.List;
import java.util.Map;

import com.bs.model.dao.EmployeeDao;
import com.bs.model.dto.Employee;

public class EmployeeService {
	
	private EmployeeDao dao = new EmployeeDao();
	private EmployeeService service = new EmployeeService();
	
	public List<Employee> selectAllEmployee(){
		Connection conn =getConnection();
		List<Employee> employees= dao.selectAllEmployee(conn);
		close(conn);
		return employees;
	}
	
	public List<Employee> searchEmployee(Map param){
		Connection conn = getConnection();
		List<Employee> employee = dao.searchEmployee(conn,param);
		close(conn);
		return employee;
		
	}
	public int insertEmployee(Employee e){
		Connection conn = getConnection();
		int result = dao.insertEmployee(conn, e);
		
		if(result>0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		close(conn);
		return result; 
		
	}
	public int updateEmployee(Employee e) {
		Connection conn = getConnection();
		int result = dao.updateEmployee(conn, e);
		if(result>0)commit(conn);
		else rollback(conn);
		close(conn);
		return result;
		
	}
	public int removeEmployee(int m) {
		Connection conn=getConnection();
		int result = dao.removeEmployee(conn, m);
		if(result>0)commit(conn);
		else rollback(conn);
		close(conn);
		return result;
	}
	public int deptManagement(Map param) {
		Connection conn = getConnection();
		int result = dao.deptManagement(conn,param);
		if(result>0)commit(conn);
		else rollback(conn);
		close(conn);
		return result;
	}
}
