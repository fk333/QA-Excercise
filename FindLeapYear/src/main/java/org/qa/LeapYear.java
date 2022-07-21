package org.qa;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int ly=2029;
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please the year: ");
		int ly=scanner.nextInt();
		
		if (ly%4==0)
		System.out.println(ly+" is a LEAP YEAR.");
		
		else
		System.out.println(ly+ " is NOT a leap year.");
		
		
			
		}
	}


