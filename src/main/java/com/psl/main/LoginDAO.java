package com.psl.main;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class LoginDAO {
	static Connection currentCon = null;
	static ResultSet rs = null;

	public boolean TestCase(String username, String password) {
		Statement stmt = null;

		String searchQuery = "select * from users where uname='"
				+ username + "' AND password='" + password + "'";
		try {
			// connecting to the DB
			// currentCon = ConnectionManager.getConnection();
			currentCon = ConnectionManager.getConnectionForPostgreSQL();
			stmt = currentCon.createStatement();
			rs = stmt.executeQuery(searchQuery);
			boolean userExists = rs.next();

			if (!userExists) {
				return false;
			} else {
				return true;

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;

	}

	public static LoginBean login(LoginBean bean) {
		Statement stmt = null;
		String username = bean.getUsername();
		String password = bean.getPassword();
		String searchQuery = "select * from users where uname='" + username
				+ "' AND password='" + password + "'";

		try {
			// connecting to the DB
			currentCon = ConnectionManager.getConnectionForPostgreSQL();
			stmt = currentCon.createStatement();
			rs = stmt.executeQuery(searchQuery);
			boolean userExists = rs.next();

			if (!userExists) {
				bean.setValid(false);
			} else if (userExists) {
				String firstName = rs.getString("FirstName");
				String lastName = rs.getString("LastName");
				bean.setFirstName(firstName);
				bean.setLastName(lastName);
				bean.setValid(true);
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return bean;
	}
}