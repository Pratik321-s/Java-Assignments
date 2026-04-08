import java.util.Scanner;

class ElectricityBill
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner();
		
		String customerName;
		int consumerNumber;
		int units;
		
		double billAmount = 0;
		double surCharge = 0;
		double finalBill;
		
		System.out.print("Enter Customer Name : ");
		customerName = sc.nextLine();
		
		System.out.print("Enter Consumer Number : ");
		consumerNumber = sc.nextInt();
		
		System.out.print("Enter Units Consumed : ");
		units = sc.nextInt();
		
		//for slab calculation
		if(units <= 100)
		{
			billAmount = units * 5;
		}else if(units <= 200 && units >= 101)
		{
			billAmount = (100 * 5) + (units - 100) * 7;
		}else
		{
			billAmount = (100 * 5) + (100 * 7) + (units - 200) * 10;
		}
		
		//surcharge
		if(billAmount > 1500)
		{
			surCharge = billAmount * 0.05;
		}
		
		//Display Bill
		finalBill = billAmount + surCharge;
		
		System.out.println("Customer Name : " + customerName);
		System.out.println("Consumer Number : " + consumerNumber);
		System.out.println("Units Consumed : " + units);
		System.out.println("Bill Amount : Rs." + billAmount);
		System.out.println("Surcharge : Rs." + surCharge);
		System.out.println("Final Bill Amount : Rs." + finalBill);
	}
}