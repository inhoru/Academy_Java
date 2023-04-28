package com.bs.model.dao;

import static com.bs.common.JDBCTemplate.close;

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

import com.bs.model.dto.Department;
import com.bs.model.dto.Employee;
import com.bs.model.dto.Job;

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
	public int insertEmployee(Connection conn , Employee e) {
		PreparedStatement pstmt = null;
		int result = 0;
		String sql = this.sql.getProperty("insertEmployee");
		try {

			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, e.getEmpName());
			pstmt.setString(2, e.getEmpNo());
			pstmt.setString(3, e.getEmail());
			pstmt.setString(4, e.getPhone());
			pstmt.setString(5, e.getDeptCode());
			pstmt.setString(6, e.getJobCode());
			pstmt.setInt(7, e.getSalary());
			pstmt.setInt(8, e.getSalary());
			pstmt.setDouble(9, e.getBonus());
			pstmt.setString(10, e.getManagerId());
			
			result = pstmt.executeUpdate();
			
		}catch(SQLException s){
			s.printStackTrace();
		}finally {
			close(pstmt);
			
		}return result;
	}
	public int updateEmployee(Connection conn, Employee e) {
		PreparedStatement pstmt = null;
		int result = 0;
		String sql = this.sql.getProperty("updateEmployee");
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, e.getDeptCode());
			pstmt.setString(2, e.getJobCode());
			pstmt.setInt(3, e.getSalary());
			pstmt.setString(4, e.getPhone());
			pstmt.setString(5, e.getEmail());
			pstmt.setInt(6, e.getEmpId());
			result = pstmt.executeUpdate();
		}catch(SQLException d) {
			d.printStackTrace();
		}finally {
			close(pstmt);
		}
		return	result;
	}
	public int removeEmployee(Connection conn, int m) {
		PreparedStatement pstmt= null;
		int result = 0;
		String sql = this.sql.getProperty("removeEmployee");
		try {
			pstmt= conn.prepareStatement(sql);
			pstmt.setInt(1, m);
			result = pstmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		return result;
	}
	public int departmentInsert(Connection conn, Department dept) {
		PreparedStatement pstmt = null;
		int result = 0;
		String sql =this.sql.getProperty("departmentInsert");
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dept.getDeptId());
			pstmt.setString(2, dept.getDeptTitle());
			pstmt.setString(3, dept.getLocationId());
			result = pstmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		return result;
	}
	public int departmentUpdate(Connection conn, Map dept) {
	    PreparedStatement pstmt = null;
	    int result = 0;
	    String sql = this.sql.getProperty("departmentUpdate");
	    try {
	        pstmt = conn.prepareStatement(sql);
	        pstmt.setString(1, (String) dept.get("deptId"));
	        pstmt.setString(2, (String) dept.get("deptTitle"));          
	        pstmt.setString(3, (String) dept.get("locationId"));
	        pstmt.setString(4, (String) dept.get("newDeptId"));
	    	result = pstmt.executeUpdate();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    } finally {
	        close(pstmt);
	    }
	    return result;
	}
	public int departmentRemove(Connection conn, String s) {
		PreparedStatement pstmt = null;
		int result = 0;
		String sql =this.sql.getProperty("departmentRemove");
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, s);
			result = pstmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		return result;
	}
	public int insertJob(Connection conn,Job j) {
		PreparedStatement pstmt=null;
		int result=0;
		String sql=this.sql.getProperty("insertJob");
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, j.getJobCode());
			pstmt.setString(2, j.getJobName());
			result=pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		return result;
	}
	
	public int updateJob(Connection conn,Job j) {
		PreparedStatement pstmt=null;
		int result=0;
		String sql=this.sql.getProperty("updateJob");
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, j.getJobName());
			pstmt.setString(2, j.getJobCode());
			result=pstmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		return result;
	}
	
	public int deleteJob(Connection conn,Job j) {
		PreparedStatement pstmt=null;
		int result=0;
		String sql=this.sql.getProperty("deleteJob");
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, j.getJobName());
			result=pstmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		return result;
	}
	
	
	
	public Employee getEmployee(ResultSet rs) throws SQLException{
		Employee e = new Employee();
		e.setEmpId(rs.getInt("emp_id"));
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