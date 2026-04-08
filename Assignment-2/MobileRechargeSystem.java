import java.util.Scanner;

class MobileRecharge
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		
		long mobileNumber;
		int amount;
		
		System.out.print("Enter Mobile Number : ");
		mobileNumber = sc.nextLong();
		
		System.out.print("Enter Recharge Amount : ");
		amount = sc.nextInt();
		
		switch(amount)
		{
			case 199:
				System.out.println("Plan: Rs.199");
				System.out.println("Validity: 28 Days");
				break;
				
			case 399:
				System.out.println("Plan: Rs.399");
				System.out.println("Validity: 56 Days");
				break;
				
			case 599:
				System.out.println("Plan: Rs.599");
				System.out.println("Validity: 84 Days");
				break;
				
			default :
				System.out.println("Invalid Recharge Amount!");
		}
		
		System.out.println("Recharge Successful.");
		System.out.println("Mobile Number : " + mobileNumber);
		System.out.println("Recharge Amount: Rs." + amount);
	}
}