package com.bs.common;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBCTemplate {
	// Connection객체를 생성해주는 기능을 제공
	public static Connection getConnection() {
		Connection conn = null;
		//절대경로가 필요함.
		//driver.properties를 불러올려면 절대경로로 불러와야한다 위치는 bin에있다.
		//클래스에잇는 위치를 가져올려고 getResource를 사용 (JDBCTemplate이 있는 최상위폴더는 bin폴더에있다.)
		String path = JDBCTemplate.class.getResource("/driver.properties").getPath();
		System.out.println(path);
		try {
			Properties driver = new Properties();
			driver.load(new FileReader(path));
			Class.forName(driver.getProperty("drivername"));
			conn = DriverManager.getConnection(driver.getProperty("url"),driver.getProperty("user"),driver.getProperty("pw"));
			conn.setAutoCommit(false);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		return conn;
	}

	// connection,Statement,Result객체를 닫아주는(반환) 기능제공
	public static void close(Connection conn) {
		try {
			if (conn != null && !conn.isClosed()) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void close(Statement stmt) {
		try {
			if (stmt != null && !stmt.isClosed()) {
				stmt.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void close(ResultSet rs) {
		try {
			if (rs != null && !rs.isClosed())
				rs.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	// 트렌젝션을 처리하는 기능을 제공
	public static void commit(Connection conn) {
		try {
			if(conn!=null&&!conn.isClosed())conn.commit();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	public static void rollback(Connection conn) {
		try {
			if(conn!=null&&!conn.isClosed())conn.rollback();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
