package com.bs.common;

import java.io.FileReader;
import java.sql.Connection;
import java.util.Properties;

public class JDBCTemplate {
	
	public static Connection getConnection() {
		Connection conn = null;
		Properties driver= new Properties();
		String path = JDBCTemplate.class.getResource("/driver.properties").getPath();
		try (FileReader fr = new FileReader(path);){
			driver.load(fr);
			
			
		}
	}
}
