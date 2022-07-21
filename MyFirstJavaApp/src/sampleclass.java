import java.util.Scanner;

public class sampleclass {

	public static void action1() {
		// TODO Auto-generated method stub
		System.out.println("Hello");
	}

	public static void action2() {
		// TODO Auto-generated method stub
		System.out.println("Hello2");
	}
	public static float action3() {
		// TODO Auto-generated method stub
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
		
		return finalAmount;
		
		//System.out.println("Hello " +name+ ". Your INTEREST PAYABLE will be: £"+simpleInterest+" and your TOTAL REPLAYMENT will be: £" +finalAmount+ " over " +lengthLoan+ " years." );
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String name="John";
			action1();
			action2();
			float z = action3();
			System.out.println(z);
			
	}
	
}