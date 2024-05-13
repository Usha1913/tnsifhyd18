package com.crud;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateData {
	public static void main(String[] args) {
		String dbURL = "jdbc:mysql://localhost:3306/employeedb";
		String username = "root";
		String password = "kair1(1#";
		 
		try {
		 
		    Connection conn = DriverManager.getConnection(dbURL, username, password);
		    String sql = "UPDATE employee SET empname=?, empsal=? WHERE empid=?";
		    
		    PreparedStatement statement = conn.prepareStatement(sql);

		    statement.setString(1, "usha12");
		    statement.setString(2,"50000");
		    statement.setString(3, "19");
		    statement.setString(1, "vaishu56");
		    statement.setString(2,"40000");
		    statement.setString(3, "20");
		    
		     
		    int rowsUpdated = statement.executeUpdate();
		    if (rowsUpdated > 0) {
		        System.out.println("An existing user was updated successfully!");
		    }
		} catch (SQLException ex) {
		    ex.printStackTrace();
		}
	}

	

}



