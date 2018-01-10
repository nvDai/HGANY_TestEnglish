package com.testenglish.demo.model.auth;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.testenglish.demo.model.SQLAccess;
import com.testenglish.demo.util.CustomStringUtils;

public class LoginValidator {

	private final String table = "users";
	private Connection connection;
	
	public LoginValidator() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		connection = SQLAccess.getConnection();
	}
	
	public boolean isValid(String email, String password) {
		String hashedPassword = CustomStringUtils.hash256(password);
		String query = "SELECT COUNT(*) AS rows_num FROM " + table
				+ " WHERE email = '" + email + "' AND password = '" + hashedPassword + "';";
		
		ResultSet result = SQLAccess.executeQuery(connection, query);
		boolean isValid = false;
		try {
			while (result.next()) {
				if (result.getInt("rows_num") == 1) isValid = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return isValid;
	}
	
}