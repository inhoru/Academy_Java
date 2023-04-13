package com.myjdbc.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.myjdbc.model.vo.Department;

public class MyjdbcTest {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		List<Department> departments = new ArrayList();
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "BS", "BS");

			conn.setAutoCommit(false);

			String sql = "SELECT * FROM DEPARTMENT";

			stmt = conn.createStatement();

			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				Department m = new Department();
				m.setDeptID(rs.getString("dept_id"));
				m.setDeptTitle(rs.getString("dept_title"));
				m.setLocationId(rs.getString("location_id"));
				// 밑에꺼처럼 가능 근대 가독성이 없어서 추천하지않는다.
//				m.setDeptID(rs.getString(1));
//				m.setDeptTitle(rs.getString(2));
//				m.setLocationId(rs.getString(3));
				departments.add(m);
			}
			departments.forEach((e) -> System.out.println(e));

		} catch (ClassNotFoundException c) {
			c.printStackTrace();
		} catch (SQLException s) {
			s.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();

			}

		}
	}
}
