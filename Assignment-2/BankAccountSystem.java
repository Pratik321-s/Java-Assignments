class BankAccount
{
	int accountNumber;
	String name;
	double balance;
	
	BankAccount()
	{
		accountNumber = 0;
		name = "Not Provided";
		balance = 0.0;
	}
	
	BankAccount(int accNo, String accName, double accBalance)
	{
		accountNumber = accNo;
		name = accName;
		balance = accBalance;
	}
	
	void display()
	{
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Name: " + name);
		System.out.println("Balance: " + balance);
	}
	
	public static void main(String []args)
	{
		BankAccount b1 = new BankAccount();
		
		BankAccount b2 = new BankAccount(101, "Rahul", 5000);
		BankAccount b3 = new BankAccount(102, "Priya", 8000);
		
		b1.display();
		b2.display();
		b3.display();
	}
}