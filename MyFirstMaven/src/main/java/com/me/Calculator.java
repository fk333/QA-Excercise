package com.me;

public class Calculator {

	public static int findBig(int x, int y)
	{
		if(x>y)
			return x;
		else
			return y;
	}

	public static int findBiggest(int a, int b, int c) 
	{
		if(a>b && a>c)
			return a;
		else if(b>c)
			return b;
		else
			return c;
		
	}
	
	public static int checkCCNum(String ccNum)
	{
		//ccNum="1234567890";
		
		int length1 = ccNum.length();
		return length1;
		
		
	}
	
	//find buggest number from an array
	
	
	
}
