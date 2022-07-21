package org;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class AddClass {

	public static void AddData()
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
			//String query="insert into student values(112,'Rochard','Rome',85799565)"; //java statement
			
			
			System.out.println("Enter an ID number: ");
			Scanner scanner=new Scanner(System.in);
			int idnum=scanner.nextInt(); 
			
			System.out.println("Enter an Name: ");
			String name1=scanner.next(); 
			
			System.out.println("Enter an Address: ");
			String address=scanner.next(); 
			
			System.out.println("Enter an PHONE number: ");
			long phone=scanner.nextLong();
			
			String query = "insert into student values("+idnum+",'"+name1+"','"+address+"',"+phone+")";
			
			
			
			Statement stmt=con.createStatement(); //sql statement
			
			stmt.executeUpdate(query);
			System.out.println("The following record has been added: "+idnum+",'"+name1+"','"+address+"',"+phone);
			
			
			
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
		
		
	
}}}
