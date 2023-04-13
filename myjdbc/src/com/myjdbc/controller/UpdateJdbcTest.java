package com.myjdbc.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateJdbcTest {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		int result = 0;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","BS","BS");
			
			conn.setAutoCommit(false);
			
			stmt = conn.createStatement();
			
			String sql = "UPDATE DEPARTMENT SET DEPT_TITLE = '학생부',LOCATION_ID = 'L3' WHERE DEPT_ID = 'D0'";
			
			
			result = stmt.executeUpdate(sql);
			
			if(result>0) {
				conn.commit(); 
				System.out.println("수정을완료했습니다.");
			}else {
				conn.rollback();
				System.out.println("수정을 실패했습니다.");
			}
			
		}catch(ClassNotFoundException c) {
			c.printStackTrace();
		}catch(SQLException s) {
			s.printStackTrace();
		}finally {
			try {
				if(stmt!=null)stmt.close();
				if(conn!=null)conn.close();
			}catch(SQLException s){
				s.printStackTrace();
				
			}
		}
	}

}
