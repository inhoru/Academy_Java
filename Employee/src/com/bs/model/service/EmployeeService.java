package com.bs.model.service;

import static com.bs.common.JDBCTemplate.close;
import static com.bs.common.JDBCTemplate.commit;
import static com.bs.common.JDBCTemplate.getConnection;
import static com.bs.common.JDBCTemplate.rollback;

import java.sql.Connection;
import java.util.List;
import java.util.Map;

import com.bs.model.dao.EmployeeDao;
import com.bs.model.dto.Department;
import com.bs.model.dto.Employee;
import com.bs.model.dto.Job;

public class EmployeeService {

	private EmployeeDao dao = new EmployeeDao();

	public List<Employee> selectAllEmployee() {
		Connection conn = getConnection();
		List<Employee> employees = dao.selectAllEmployee(conn);
		close(conn);
		return employees;
	}

	public List<Employee> searchEmployee(Map param) {
		Connection conn = getConnection();
		List<Employee> employee = dao.searchEmployee(conn, param);
		close(conn);
		return employee;

	}

	public int insertEmployee(Employee e) {
		Connection conn = getConnection();
		int result = dao.insertEmployee(conn, e);

		if (result > 0) {
			commit(conn);
		} else {
			rollback(conn);
		}
		close(conn);
		return result;

	}

	public int updateEmployee(Employee e) {
		Connection conn = getConnection();
		int result = dao.updateEmployee(conn, e);
		if (result > 0)
			commit(conn);
		else
			rollback(conn);
		close(conn);
		return result;

	}

	public int removeEmployee(int m) {
		Connection conn = getConnection();
		int result = dao.removeEmployee(conn, m);
		if (result > 0)
			commit(conn);
		else
			rollback(conn);
		close(conn);
		return result;
	}

	public int departmentInsert(Department dept) {
		Connection conn = getConnection();
		int result = dao.departmentInsert(conn, dept);

		if (result > 0) {
			commit(conn);
		} else {
			rollback(conn);
		}
		close(conn);
		return result;
	}

	public int departmentUpdate(Map m) {
	    Connection conn = getConnection();
	    int result = dao.departmentUpdate(conn, m);

	    if (result > 0) {
	        commit(conn);
	    } else {
	        rollback(conn);
	    }
	    close(conn);
	    return result;
	}

	public int departmentRemove(String dept) {
		Connection conn = getConnection();
		int result = dao.departmentRemove(conn, dept);

		if (result > 0) {
			commit(conn);
		} else {
			rollback(conn);
		}
		close(conn);
		return result;
	}
	public int insertJob(Job j) {
		Connection conn=getConnection();
		int result=dao.insertJob(conn, j);
		if(result>0) {
			commit(conn);
		}
		else {
			rollback(conn);
		}
		close(conn);
		return result;
	}
	
	public int updateJob(Job j) {
		Connection conn=getConnection();
		int result=dao.updateJob(conn, j);
		if(result>0) {
			commit(conn);
		}
		else {
			rollback(conn);
		}
		close(conn);
		return result;
	}
	public int deleteJob(Job j) {
		Connection conn=getConnection();
		int result=dao.deleteJob(conn, j);
		if(result>0) {
			commit(conn);
		}
		else {
			rollback(conn);
		}
		close(conn);
		return result;
	}
}