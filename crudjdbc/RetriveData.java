package com.crud;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;

	public class RetriveData {
		
		public static void main(String[] args) {
			String dbURL = "jdbc:mysql://localhost:3306/employeedb";
			String username = "root";
			String password = "kair1(1#";
			 
			try(Connection conn = DriverManager.getConnection(dbURL, username, password)) {
			 
				String sql = "SELECT * FROM Employee";
				 
				Statement statement = conn.createStatement();
				ResultSet result = statement.executeQuery(sql);
				 
				int count = 0;
				 
				while (result.next()){
					String empid = result.getString(2);
				    String empname = result.getString(3);
				    String empsal = result.getString(1);
				    
				 
				    String output = "Employee #%d: %s - %s - %s ";
				    System.out.println(String.format(output, ++count, empid, empname, empsal));
				}
			} catch (SQLException ex) {
			    ex.printStackTrace();
			}

		}

	}



