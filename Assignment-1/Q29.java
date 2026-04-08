//29. Create a menu-driven program: 
//1. Add 
//2. Subtract 
//3. Exit

import java.util.Scanner;

class Q29{

	public static void main(String []args){

		Scanner sc = new Scanner(System.in);
	
        	int choice;
        	double num1, num2;

        	do {
            		// Display the menu
            		System.out.println("\n--- Menu ---");
            		System.out.println("1. Add");
            		System.out.println("2. Subtract");
            		System.out.println("3. Exit");
            		System.out.print("Enter your choice: ");
            		choice = sc.nextInt();

            	switch (choice) {
                	case 1:
                    		System.out.print("Enter first number: ");
                    		num1 = sc.nextDouble();
                    		System.out.print("Enter second number: ");
                    		num2 = sc.nextDouble();
                    		System.out.println("Result: " + (num1 + num2));
                    		break;

                	case 2:
                    		System.out.print("Enter first number: ");
                    		num1 = sc.nextDouble();
                    		System.out.print("Enter second number: ");
                    		num2 = sc.nextDouble();
                    		System.out.println("Result: " + (num1 - num2));
                    		break;

                	case 3:
                    		System.out.println("Exiting program...");
                    		break;

                	default:
                    		System.out.println("Invalid choice! Please try again.");
            		}
        	} 
		while (choice != 3);

	}

}