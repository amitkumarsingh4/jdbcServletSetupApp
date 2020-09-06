package com.ecommerce.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	private Connection connection;

	
	public DBConnection (String url, String username, String password) throws ClassNotFoundException, SQLException {
		
		
				//1. Register Driver
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				//2. Create Connection
				this.connection = DriverManager.getConnection(url,username,password);
				
	}
	
	public Connection getConnection() {
		return connection;
	}
	
	public void closeConnection() throws SQLException {
		
		if(this.connection !=null) {
		connection.close();}
	}

}
