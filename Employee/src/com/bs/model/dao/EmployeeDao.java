package com.bs.model.dao;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import com.bs.model.dto.Employee;
import static com.bs.common.JDBCTemplate.close;

public class EmployeeDao {
	private Properties sql = new Properties();
	
	{
		try {
		String path=Employee.class.getResource("/sql_employee.properties").getPath();
			sql.load(new FileReader(path));
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public List<Employee> selectAllEmployee(Connection conn){
		PreparedStatement pstmt =null;
		ResultSet rs = null;
		List<Employee> employees= new ArrayList();
		String sql =this.sql.getProperty("selectAllEmployee");
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				employees.add(getEmployee(rs));						
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			close(rs);
			close(pstmt);
		}
		return employees;
	}
	public List<Employee> searchEmployee(Connection conn, Map param){
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Employee> employees = new ArrayList<>();
		
		String sql = this.sql.getProperty("selectSearchEmployee");
		sql = sql.replace("#COL", (String)param.get("col"));
		
		String sqlsalaryhigt = this.sql.getProperty("selectSalaryHigt");
		sqlsalaryhigt = sqlsalaryhigt.replace("#COL", (String)param.get("col"));
		
		String sqlsalarylow = this.sql.getProperty("selectSalaryLow");
		sqlsalarylow = sqlsalarylow.replace("#COL", (String)param.get("col"));
		
		try {
					int su = (int) param.get("ch");
			if(su == 2) {				
				pstmt = conn.prepareStatement(sqlsalaryhigt);
				pstmt.setInt(1, (int) param.get("keyword"));
			}else if(su==1) {
				pstmt = conn.prepareStatement(sqlsalarylow);
				pstmt.setInt(1, (int) param.get("keyword"));				
			}else if(su==0){
				pstmt=conn.prepareStatement(sql);
				pstmt.setString(1, (String)param.get("keyword"));
			}
			rs=pstmt.executeQuery();
			while(rs.next()) {
				employees.add(getEmployee(rs));
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			close(rs);
			close(pstmt);
		}
		return employees;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public Employee getEmployee(ResultSet rs) throws SQLException{
		Employee e = new Employee();
		e.setEmpId(rs.getString("emp_id"));
		e.setEmpName(rs.getString("emp_name"));
		e.setEmpNo(rs.getString("emp_no"));
		e.setEmail(rs.getString("email"));
		e.setPhone(rs.getString("phone"));
		e.setDeptCode(rs.getString("dept_code"));
		e.setJobCode(rs.getString("job_code"));
		e.setSalLevel(rs.getString("sal_level"));
		e.setSalary(rs.getInt("salary"));
		e.setBonus(rs.getDouble("bonus"));
		e.setManagerId(rs.getString("manager_id"));
		e.setHireDate(rs.getDate("hire_date"));
		e.setEntDate(rs.getDate("ent_date"));
		e.setEntYn(rs.getString("ent_yn").charAt(0));
		return e;
	}
}
