import java.util.Scanner;

class ATM
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		
		int choice;
		double balance = 100;
		
		do{
			System.out.println("1. Check Balance.");
			System.out.println("2. Deposit Money.");
			System.out.println("3. Withdraw Money.");
			System.out.println("4. Exit.");
			System.out.print("Enter Your Choice : ");
		
			choice = sc.nextInt();
		
		switch(choice)
		{
			case 1:
				System.out.println("Current Balance : " + balance);
				break;
			
			case 2:
				System.out.println("Enter Amount to Deposit : ");
				double deposit = sc.nextDouble();
				balance = balance + deposit;
				System.out.println("Amount Deposited Successfully.");
				break;
			
			case 3: 
				System.out.println("Enter Amount to Withdraw : ");
				double withdraw = sc.nextDouble();
				if(withdraw <= balance)
				{
					balance = balance - withdraw;
					System.out.println("Withdrawl Successfully.");
				}else{
					System.out.println("Insufficient Balance");
				}
				break;
			
			case 4:
				System.out.println("Exit.");
				break;
			
			default :
				System.out.println("Invalid Choice!");
		}
		}While(choice != 4);
	}
}