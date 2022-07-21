package org;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateTest {

	public static void update1()
	
	{
	
	String url="jdbc:mysql://localhost:3306/qa-sample";
	String userName="root";
	String password="1234";
	Connection con=null;
	
	try {
		con=DriverManager.getConnection(url,userName, password);
		System.out.println("Connection successful");
		
		//read, update, delete operations occur here
		
		//below is how to insert
		String query="insert into student values(112,'Rochard','Rome',85799565)"; //java statement
		Statement stmt=con.createStatement(); //sql statement
		
		stmt.executeUpdate(query);
		System.out.println("one record inserted");
		
		
		
	} catch (SQLException e) {
		System.out.println(e.getMessage());
		e.printStackTrace();
	}finally //used to close the connection to the database
	{
		try {
			con.close();
			System.out.println("Database connection closed");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	}
	
}
