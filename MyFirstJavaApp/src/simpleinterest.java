import java.util.Scanner;

public class simpleinterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Please enter your name: ");
		//String name=scanner.next();
		Scanner scanner=new Scanner(System.in);
		System.out.println("What is your name?: ");
		String name=scanner.next();
		System.out.println("Capital amount?: ");
		float capitalAmount=scanner.nextFloat();
		System.out.println("Interest rate?: ");
		float intRate=scanner.nextFloat();
		System.out.println("Length of loan in years?: ");
		float lengthLoan=scanner.nextFloat();
		
		float finalAmount=capitalAmount*(1+((intRate/100)*lengthLoan));
		float simpleInterest=finalAmount - capitalAmount;
		
		System.out.println("Hello " +name+ ". Your INTEREST PAYABLE will be: £"+simpleInterest+" and your TOTAL REPLAYMENT will be: £" +finalAmount+ " over " +lengthLoan+ " years." );
	}

}
