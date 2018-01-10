package com.testenglish.demo.model.auth;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.testenglish.demo.model.SQLAccess;

public class SignUpValidator {

	private final String table = "users";
	private Connection connection;
	
	public SignUpValidator() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		connection = SQLAccess.getConnection();
	}
	
	public boolean isEmailValid(String email) {
		String query = "SELECT COUNT(*) AS rows_num FROM " + table
				+ " WHERE email = '" + email + "';";
		
		ResultSet result = SQLAccess.executeQuery(connection, query);
		boolean isValid = false;
		try {
			while(result.next()) {
				if (result.getInt("rows_num") == 0) isValid = true;
			};
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return isValid;
	}
	
}
