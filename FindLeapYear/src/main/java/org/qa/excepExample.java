package org.qa;

public class excepExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		
		int x = 10;
		int y = 0;
		int z = x / y;
		
		System.out.println(z);
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println("Something went wrong");
		}
				
	}

}
