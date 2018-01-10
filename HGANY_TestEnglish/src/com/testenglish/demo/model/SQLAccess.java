package com.testenglish.demo.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public interface SQLAccess {

	static final String DATABASE_URL = "jdbc:mysql://localhost:3306/hgany_testenglish?useUnicode=true&characterEncoding=UTF-8";
	static final String USERNAME = "root";
	static final String PASSWORD = "";
	
	static Connection getConnection() {
		Properties connectionProps = new Properties();
		connectionProps.put("user", USERNAME);
		connectionProps.put("password", PASSWORD);
		
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(DATABASE_URL, connectionProps);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return conn;
	}
	
	static ResultSet executeQuery(Connection conn, String query) {
		Statement stmt = null;
		ResultSet result = null;
		try {
			stmt = conn.createStatement();
			result = stmt.executeQuery(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	static void executeUpdate(Connection conn, String query) {
		Statement stmt = null;
		try {
			stmt = conn.createStatement();
			stmt.executeUpdate(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
