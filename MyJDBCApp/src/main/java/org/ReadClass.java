package org;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadClass {

	public static void ReadData()
	{
		String url="jdbc:mysql://localhost:3306/qa-sample";
		String userName="root";
		String password="1234";
		Connection con=null;
		
		try {
			con=DriverManager.getConnection(url,userName, password);
			System.out.println("Connection successful");
			
			//read, update, delete operations occur here in the try block
			
			//below is how to read
			String query="select * from student"; //java statement
			Statement stmt=con.createStatement(); //sql statement
			ResultSet rs=stmt.executeQuery(query); //execute the statement and store result
			while(rs.next())  //loop for each "rs" ITERATE THROUGH THE RESULT
			{
				int id=rs.getInt(1); //defininf which column to get id from the database
				String name=rs.getString(2);
				String address=rs.getString(3);
				long phone=rs.getLong(4);
				System.out.println(id+"--"+name+"--"+address+"--"+phone);
			}
			
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}finally //used to close the connection to the database
		{
			try {
				con.close(); // connection closed.
				System.out.println("Database connection closed");
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		
		
		
	}
	
	}
	}
