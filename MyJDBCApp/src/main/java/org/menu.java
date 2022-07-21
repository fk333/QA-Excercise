package org;

import java.util.Scanner;

public class menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
        boolean ans=true;
        
        while(ans){
        
        System.out.println("------------------------------");	
		System.out.println("Database Query App");
		System.out.println("------------------------------");
		System.out.println("Please enter a number for the operation you want to perform: ");
		System.out.println("1.  Read records");
		System.out.println("2.  Add record");
		System.out.println("3.  Update record");
		System.out.println("4.  Exit App");
		
		
		int choice = scn.nextInt();
		switch (choice) {
		case 1:
			System.out.println("READ records selected");
			ReadClass.ReadData();
			break;
		case 2:
			System.out.println("ADD record selected");
			AddClass.AddData();
			ReadClass.ReadData();
			break;
		case 3:
			System.out.println("UPDATE record selected");
			UpdateClass.UpdateData();
			ReadClass.ReadData();
			break;	
		case 4:
			System.out.println("Quiting...");
			ans=false;
			break;
		default:
			System.out.println("Enter correct choice");
		
		}	
	}
	}		
}
