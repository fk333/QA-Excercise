package testingPrime;

import java.util.Scanner;

public class primetest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		System.out.println("==Welcome to the Prime Number Finder==");
		System.out.println(" ");
		System.out.println("Enter a PRIME number: ");
		System.out.println(" ");
		
		Scanner scanner=new Scanner(System.in);
		int x=scanner.nextInt();
		int i=2;
		
		while(i<=x) {
		
		if(i>=x) {
		
			System.out.println(x+" is a Prime Number.  ("+ i+ " loops)");
			break;
			
			}else {
				
				if (x%i==0)
				{
					System.out.println(x+" is NOT a Prime Number  (" + i + " loops)");
					break;
					
				} else {
					i=i+1;
				}
				
				
			}
		
		}
		
		//prime numbers 65717 , 2749 , 97
		// not primes 67717 , 9653 
		
		}
	}


