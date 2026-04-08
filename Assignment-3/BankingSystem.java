import java.util.*;

class Account
{
	private int accountNumber;
	private String holderName;
	private double balance;
	
	private static int totalAccounts = 0;
	
	Account(int accountNumber, String holderName, double balance)
	{
		this.accountNumber = accountNumber;
		this.holderName = holderName;
		this.balance = balance;
		totalAccounts++;
	}
	
	public void deposit(double amount)
	{
		balance = balance + amount;
		System.out.println("Deposit (Cash): " + amount);
	}
	
	public void deposit(double amount, String mode)
	{
		balance = balance + amount;
		System.out.println("Deposited (" + mode + "): " + amount);
	}
	
	public void withdraw(double amount)
	{
		if(amount > balance){
			System.out.println("Insufficient Balance! Withdrawl failed");
		}else{
			balance = balance - amount;
			System.out.println("Withdrawn: " + amount);
		}
	}
	
	public int getAccountNumber()
	{
		return accountNumber;
	}
	
	public static int getTotalAccounts()
	{
		return totalAccounts;
	}
}

class Bank
{
	private List<Account> accounts = new ArrayList<>();
	
	public void addAccount(Account acc)
	{
		accounts.add(acc);
	}
	
	public Account findAccount(int accNo)
	{
		for(Account acc : accounts)
		{
			if(acc.getAccountNumber() == accNo){
				return acc;
			}
		}
		return null;
	}
	
	public void displayAllAccounts()
	{
		for(Account acc : accounts)
		{
			acc.displayAllAccounts();
		}
	}
}

class BankingSystem
{
	public static void main(String []args)
	{
		Bank bank = new Bank();
		
		Account acc1 = new Account(101, "Pratik", 5000);
		Account acc2 = new Account(102, "Prathmesh", 3000);
		
		bank.addAccount(acc1);
		bank.addAccount(acc2);
		
		acc1.deposit(1000);
		acc1.deposit(500, "Online");
		acc1.withdraw(2000);
		acc1.withdraw(10000);
		
		acc2.deposit(2000, "UPI");
		acc2.withdraw(1000);
		
		bank.displayAllAccounts();
		
		System.out.println("Total Accounts : " + Account.getTotalAccounts());
	}
}