package MyApp;
import java.util.Scanner;

public class simpleinterest {

	public static void siCalc(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Please enter your name: ");
		//String name=scanner.next();
		Scanner scanner=new Scanner(System.in);
		System.out.println("==Welcome to the Simple Interest Calculator== ");
		//String name=scanner.next();
		System.out.println(" ");
		System.out.println("Capital amount?: ");
		float capitalAmount=scanner.nextFloat();
		System.out.println("Interest rate?: ");
		float intRate=scanner.nextFloat();
		System.out.println("Length of loan in years?: ");
		float lengthLoan=scanner.nextFloat();
		
		float finalAmount=capitalAmount*(1+((intRate/100)*lengthLoan));
		float simpleInterest=finalAmount - capitalAmount;
		
		System.out.println("INTEREST PAYABLE will be: £"+simpleInterest+" -- TOTAL REPLAYMENT: £" +finalAmount+ " over " +lengthLoan+ " years." );
	}

}
