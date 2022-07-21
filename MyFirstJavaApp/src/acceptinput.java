import java.util.Scanner;

public class acceptinput {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter your name: ");
		String name=scanner.next();
		
		System.out.println("Please enter your age: ");
		int age=scanner.nextInt();
		System.out.println("Hello "+name + ". You are "+age +" old.");
	}

}
