package com.myjdbc.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertJdbcTest {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		int result = 0;
		try {
			// 라이브러리에 jar파일이 있는지확인
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// DriverManager클래스를 이용해서 접속한후 객체생성

			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "BS", "BS");

			conn.setAutoCommit(false);

			stmt = conn.createStatement();
			
			String sql = "INSERT INTO DEPARTMENT VALUES('D0','강사부','L2')";


			result = stmt.executeUpdate(sql);

			if (result > 0)
				conn.commit(); // 입력이완료되었습니다.
			else
				conn.rollback();//입력에실패함.

		} catch (ClassNotFoundException c) {
			c.printStackTrace();
		} catch (SQLException s) {
			s.printStackTrace();
		} finally {
			try {

				if (stmt != null)
					stmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException s) {
				s.printStackTrace();
			}
		}

	}

}
