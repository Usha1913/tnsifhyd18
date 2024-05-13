package com.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertData {
	public static void main(String[] args) {
		String dbURL = "jdbc:mysql://localhost:3306/employeedb";
		String username = "root";
		String password = "kair1(1#";
		 
		try {
		 
		    Connection conn = DriverManager.getConnection(dbURL, username, password);
		    String sql = "INSERT INTO Employee (empid, empname,empsal) VALUES (?, ?, ?)";
		    
		    PreparedStatement statement = conn.prepareStatement(sql);
		    statement.setString(1, "19");
		    statement.setString(2, "usha");
		    statement.setString(3, "50000");
		    statement.setString(1, "21");
		    statement.setString(2, "ashwini");
		    statement.setString(3, "70000");
		    statement.setString(1, "23");
		    statement.setString(2, "sona");
		    statement.setString(3, "90000");
		    
		    
		    
		    
		     
		    int rowsInserted = statement.executeUpdate();
		    if (rowsInserted > 0) {
		        System.out.println("A new user was inserted successfully!");
		    }
		} catch (SQLException ex) {
		    ex.printStackTrace();
		}
	}
}
	
	
