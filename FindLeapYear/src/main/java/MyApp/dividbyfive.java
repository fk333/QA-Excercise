package MyApp;

import java.util.Scanner;

public class dividbyfive {

	public static void div5()
	{
	System.out.println("==Welcome to Divide by Five==");
	System.out.println(" ");
	System.out.println("Enter a number: ");
	
	Scanner scanner=new Scanner(System.in);
	int x=scanner.nextInt();
	
	if (x%5==0)
	{
		System.out.println(x+" is a Divisable by 5. ");
	} else {
		System.out.println(x+" is NOT Divisable by 5.");
	}
	}
	
}
