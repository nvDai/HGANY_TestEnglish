package com.testenglish.demo.model.user;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.testenglish.demo.model.SQLAccess;
import com.testenglish.demo.util.CustomStringUtils;

public class UsersManager {
	
	private final String table = "users";
	private Connection connection;
	
	public UsersManager() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		connection = SQLAccess.getConnection();
	}

	public User getUserFromDB(String email, String password) {
		String hashedPassword = CustomStringUtils.hash256(password);
		String query = "SELECT * FROM " + table
				+ " WHERE email = '" + email + "' AND password = '" + hashedPassword + "';";
		
		ResultSet result = SQLAccess.executeQuery(connection, query);
		User user = new User();
		try {
			while (result.next()) {
				user.setEmail(email);
				user.setPassword(password);
				user.setName(result.getString("name"));
				user.setGender(result.getString("gender"));
				user.setDateOfBirth(result.getString("date_of_birth"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return user;
	}
	
	public void saveUserToDB(User user) {
		String email = user.getEmail();
		String password = user.getHashedPassword();
		String name = user.getName();
		String gender = user.getGender();
		String dateOfBirth = user.getDateOfBirth();
		
		String query = "INSERT INTO " + table + "(email, password, name, gender, date_of_birth)"
				+ " VALUES('" + email + "', '" + password + "', '" + name + "', '" + gender + "', '" + dateOfBirth + "');";
		
		SQLAccess.executeUpdate(connection, query);
	}
	
}
