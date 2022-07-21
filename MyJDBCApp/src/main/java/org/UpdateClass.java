package org;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateClass {
	public static void UpdateData()
	{
		String url="jdbc:mysql://localhost:3306/qa-sample";
		String userName="root";
		String password="1234";
		Connection con=null;
		
		try {
			con=DriverManager.getConnection(url,userName, password);
			System.out.println("Connection successful");
			
			//read, update, delete operations occur here in the try block
			
			//below is how to update a record
						
			System.out.println("Enter an ID number: ");
			Scanner scanner=new Scanner(System.in);
			int idnum=scanner.nextInt(); 
			
			System.out.println("Which column do you want to UPDATE for record "+idnum);
			System.out.println("Press 1 to update NAME");
			System.out.println("Press 2 to update ADDRESS");
			System.out.println("Press 3 to update PHONE");
			
			
			
			int choice = scanner.nextInt();
			String changeCol;
			
			switch (choice) {
			case 1:
				System.out.println("NAME");
				
				System.out.println("Enter new Name: ");
				String newName=scanner.next(); 
				
				changeCol="name";
				
				
				String query = "update student set "+changeCol+"='"+newName+"' where id="+idnum;
				
				Statement stmt=con.createStatement(); //sql statement
				stmt.executeUpdate(query); //execute the statement and store result
				System.out.println("Record number "+idnum+" updated");
				
				
				break;
			case 2:
				System.out.println("ADDRESS");
				
				System.out.println("Enter new address: ");
				String newAddress=scanner.next(); 
				
				changeCol="address";
				
				
				query = "update student set "+changeCol+"='"+newAddress+"' where id="+idnum;
				
				stmt=con.createStatement(); //sql statement
				stmt.executeUpdate(query); //execute the statement and store result
				System.out.println("Record number "+idnum+" updated");
				
				break;
			case 3:
				System.out.println("PHONE");
				
				System.out.println("Enter new phone number: ");
				String newPhone=scanner.next(); 
				
				changeCol="phone";
				
				
				query = "update student set "+changeCol+"='"+newPhone+"' where id="+idnum;
				
				stmt=con.createStatement(); //sql statement
				stmt.executeUpdate(query); //execute the statement and store result
				System.out.println("Record number "+idnum+" updated");
				
				break;	
			default:
				System.out.println("Enter correct choice");
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
