import java.util.*;

class Payment
{
	protected int paymentId;
	protected double amount;
	
	Payment(int paymentId, double amount)
	{
		this.paymentId = paymentId;
		this.amount = amount;
	}
	
	public void displayPayment()
	{
		System.out.println("Payment ID: " + paymentId);
		System.out.println("Amount: " + amount);
	}
}

class CreditCardPayment extends Payment
{
	private String cardNumber;
	
	CreditCardPayment(int paymentId, double amount, String cardNumber)
	{
		super(paymentId, amount);
		this.cardNumber = cardNumber;
	}
	
	public void displayPayment()
	{
		System.out.println("Credit Card Payment: ");
		super.displayPayment();
		System.out.println("Card Number: " + cardNumber);
	}
}

class UPIPayment extends Payment
{
	private String upiId;
	
	UPIPayment(int paymentId, double amount, String upiId)
	{
		super(paymentId, amount);
		this.upiId = upiId;
	}
	
	public void displayPayment()
	{
		System.out.println("UPI Payment: ");
		super.displayPayment();
		System.out.println("UPI ID: " + upiId);
	}
}

class PaymentProcessor
{
	public static void displayAllPayments(List<? extends Payment> payments)
	{
		for(Payment p : payments)
		{
			p.displayPayment();
		}
	}
}

class Main
{
	public static void main(String []args)
	{
		ArrayList<CreditCardPayment> creditList = new ArrayList<>();
		creditList.add(new CreditCardPayment(101, 5000, "1234-5678-1111"));
		creditList.add(new CreditCardPayment(102, 7500, "2222-3333-4444"));
		creditList.add(new CreditCardPayment(103, 12000, "5555-6666-7777"));
		
		ArrayList<UPIPayment> upiList = new ArrayList<>();
		upiList.add(new UPIPayment(201, 1500, "user1@upi"));
		upiList.add(new UPIPayment(202, 2200, "user2@upi"));
		upiList.add(new UPIPayment(203, 3300, "user3@upi"));
		
		System.out.println("=== Credit Card Payments ===");
		PaymentProcessor.displayAllPayments(creditList);
		
		System.out.println("=== UPI Payments ===");
		PaymentProcessor.displayAllPayments(upiList);
	}
}