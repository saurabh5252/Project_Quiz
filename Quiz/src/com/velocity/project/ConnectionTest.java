package com.velocity.project;

import java.sql.DriverManager;
import java.sql.Connection;

public class ConnectionTest {
	
	Connection connection = null;
	public Connection getConnectionDetails() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz","root","Saurabh@2411");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;

}
}
