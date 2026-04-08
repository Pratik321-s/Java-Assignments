import java.util.Scanner;

class GroceryBill
{
	// method for input items
	static void inputItems(String []itemNames, int []quantity, double []price, int n, Scanner sc)
	{
		for(int i = 0; i < n; i++)
		{
			System.out.print("Enter Item Name : ");
			itemNames[i] = sc.next();

			System.out.print("Enter Quantity : ");
			quantity[i] = sc.nextInt();
			
			System.out.print("Enter Price : ");
			price[i] = sc.nextDouble();
		}
	}
	
	//method to calculate totals
	static double calculateTotal(String []itemNames, int []quantity, double []price, double []total, int n)
	{
		double grandTotal = 0;
		
		for(int i = 0; i < n; i++)
		{
			total[i] = quantity[i] * price[i];
			grandTotal = grandTotal + total[i];
		}
		return grandTotal;
	}
	
	//method for discount
	static double discount(double grandTotal)
	{
		if(grandTotal > 3000)
		{
			return grandTotal * 0.10;
		}
		return 0;
	}
	
	//method to print bill
	static void printBill(String []itemNames, int []quantity, double []price, double []total
						  int n, double grandTotal, double discount, double finalAmount)
	{
		for(int i = 0; i < n; i++)
		{
			System.out.println(itemNames[i] + " " + quantity[i] + " " + price[i] + " " + total[i]);
		}
		
		System.out.println("Total Amount : Rs." + grandTotal);
		System.out.println("Discount : Rs." + discount);
		System.out.println("Final Amount : Rs." + finalAmount);
	}
	
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		
		String []itemNames = new String[50];
		int []quantity = new int[50];
		double []price = new double[50];
		double []total = new double[50];
		
		System.out.print("Enter Number of Items : ");
		int n = sc.nextInt();
		
		inputItems(itemNames, quantity, price, n, sc);
		double grandTotal = calculateTotal(itemNames, quantity, price, total, n);
		double discount = applyDiscount(grandTotal);
		double finalAmount = grandTotal - discount;
		printBill(itemNames, quantity, price, total, n, grandTotal, discount, finalAmount);
	}
} 