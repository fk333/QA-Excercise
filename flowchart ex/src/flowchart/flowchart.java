package flowchart;

public class flowchart {
//this is the answer for QA excerise in the Conditionals section
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 599;
        int number2 = 20;

        if(a > 2000) {
        	
        	System.out.println("A");
        	
        	if(a > 6000) {
        		System.out.println("C");
        	} else {
        		System.out.println("B");
        		if (a > 4000) {
        			System.out.println("D");
        		} else {
        			System.out.println("E");
        		}
        	}
        	
        	
        } else {
            System.out.println("1");
            if (a > 100) {
            	System.out.println("3");
            	if (a > 600) {
            		System.out.println("5");
            	} else {
            		System.out.println("4");
            	}
            } else {
            	System.out.println("2");
            }
        }
	}

}
