package com.bs.model.service;

import static com.bs.common.JDBCTemplate.close;
import static com.bs.common.JDBCTemplate.getConnection;

import java.sql.Connection;
import java.util.List;

import com.bs.model.dao.EmployeeDao;
import com.bs.model.dto.Employee;

public class EmployeeService {
	
	private EmployeeDao dao = new EmployeeDao();
	
	
	public List<Employee> selectAllEmployee(){
		Connection conn =getConnection();
		List<Employee> employees= dao.selectAllEmployee(conn);
		close(conn);
		return employees;
	}
}
