import java.util.*;

//product class
class Product
{
	int productId;
	String productName;
	String price;	//stored as String
	
	Product(int productId, String productName, String price)
	{
		this.productId = productId;
		this.productName = productName;
		this.price = price;
	}
	
	//convert price from String to double using wrapper class
	double priceAsDouble() throws NumberFormatException
	{
		return Double.parseDouble(price);
	}
}

//order class
class Order
{
	String customerName;
	Product []products;
	
	Order(String customerName, Product []products)
	{
		this.customerName = customerName;
		this.products = products;
	}
	
	//calculate total bill
	double calculateTotal()
	{
		double total = 0;
		for(Product p : products)
		{
			total = total + p.priceAsDouble();
		}
		return total;
	}
	
	//overloaded method
	double calculateTotal(double discountPercent)
	{
		double total = calculateTotal();
		double discount = total * discountPercent / 100;
		return total - discount;
	}
	
	//generate bill using stringbuilder
	String generateBill(double finalAmount)
	{
		StringBuilder bill = new StringBuilder();
		
		bill.append("Customer: ").append(customerName);
		
		for(Product p : products)
		{
			bill.append("Product: ").append(p.productName).append(" | Price: ").append(p.price);
		}
		
		bill.append("Total Payable: ").append(finalAmount);
		
		return bill.toString();
	}
}

//payment interface
interface Payment
{
	void pay(double amount);
	void refund(double amount);
}

//upi payment class
class UPIPayment implements Payment
{
	public void pay(double amount)
	{
		System.out.println("Paid Rs." + amount + " using UPI.");
	}
	
	public void refund(double amount)
	{
		System.out.println("Refunded Rs." + amount + " via UPI.");
	}
}

//card payment class
class CardPayment implements Payment
{
	public void pay(double amount)
	{
		System.out.println("Paid Rs." + amount + " using Card.");
	}
	
	public void refund(double amount)
	{
		System.out.println("Refunded Rs." + amount + " to Card.");
	}
}

//main class
class Main
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		
		try{
			//input customer name
			System.out.print("Enter Customer Name: ");
			String name = sc.nextLine();
			
			//Product count
			System.out.println("Enter number of products");
			int n = sc.nextInt();
			sc.nextLine();
			
			if(n <= 0){
				throw new Exception("Prodcut must be greater than 0!");
			}
			
			Product []products = new Product[n];
			
			//input product details
			for(int i = 0; i < n; i++)
			{
				System.out.println("Enter details for Product " + (i + 1));
				
				System.out.print("ID: ");
				int id = sc.nextInt();
				sc.nextLine();
				
				System.out.print("Name: ");
				String pname = sc.nextLine();
				
				System.out.print("Price (String): ");
				String price = sc.nextLine();
				
				//validate price
				Double.parseDouble(price);
				
				products[i] = new Product(id, pname, price);
			}
			
			//create order
			Order order = new Order(name, products);
			
			//discount
			System.out.print("Enter discount % : ");
			double discount = sc.nextDouble();
			
			double finalAmount;
			
			if(discount > 0){
				finalAmount = order.calculateTotal(discount);
			}else{
				finalAmount = order.calculateTotal();
			}
			
			//payment option
			System.out.println("Choose Payment Method: ");
			System.out.println("1. UPI");
			System.out.println("2. Card");
			
			int choice = sc.nextInt();
			
			Payment payment;
			
			switch(choice){
				case 1:
					payment = new UPIPayment();
					break;
				
				case 2:
					payment = new CardPayment();
					break;
					
				default : 
					throw new Exception("Invalid Payment Option!");
			}
			
			
			//Generate and print bill
			System.out.println(order.generateBill(finalAmount));
			
			//Payment
			Payment.pay(finalAmount);
			
			System.out.println("Payment Successful!");
		}catch(NumberFormatException e){
			System.out.println("Invalid Price Entered! Please enter numeric value");
		}catch(Exception e){
			System.out.println("Error: " + e.getMessage());
		}
		
		sc.close();
	}
}