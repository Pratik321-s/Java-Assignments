import java.util.Scanner;

class RestaurantOrder
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		
		int choice;
		double total = 0;
		String moreOrder;
		
		do{
			//Menu Display
			System.out.print("1. Burger - 100");
			System.out.print("2. Pizza - 200");
			System.out.print("3. Pasta - 150");
			System.out.print("4. Sandwich - 80");
			System.out.print("5. Coffee - 50");
			
			System.out.print("Enter Your Choice : ");
			choice = sc.nextInt();
			
			switch(choice){
				case 1:
					System.out.println("Burger added to order");
					total = total + 100;
					break;
					
				case 2:
					System.out.pritnln("Pizza added to order");
					total = total + 200;
					break;
					
				case 3:
					System.out.println("Pasta added to order");
					total = total + 150;
					break;
					
				case 4:
					System.out.println("Sandwich added to order");
					total = total + 80;
					break;
					
				case 5:
					System.out.println("Coffee added to order");
					total = total + 50;
					break;
					
				default :
					System.out.println("Invalid Choice !");
			}
			
			//if user wants to order again
			
			System.out.print("Do you want to order more ? (YES/No) : ");
			moreOrder = sc.next();
		}while(moreOrder == "YES");
		
		//Calculate GST
		double gst = total * 0.05;
		double finalAmount = total + gst;
		
		//Bill Printing
		System.out.pritnln("Total Amount = " + total);
		System.out.println("GST (5%) = " + gst);
		System.out.println("Final Amount = " + finalAmount);
	}
}