import java.util.Scanner;

//bankservice interface
interface BankService
{
	void deposit(double amount);
	void withdraw(double amount);
}

//base class
class Account
{
	int accountNumber;
	String accountHolderName;
	double balance;
	
	Account(int accNo, String name, String balance)
	{
		this.accountNumber = accNo;
		this.accountHolderName = name;
		
		try{
			this.balance = Double.parseDouble(balance);
		}catch(NumberFormatException e){
			System.out.println("Invalid balance input! Setting balance to 0");
			this.balance = 0;
		}
	}
	
	//method to display details
	void displayAccountDetails(){
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Account Holder: " + accountHolderName);
		System.out.println("Balance: " + balance);
	}
	
	//Account summary using stringbuilder
	String generateSummary()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("Account Number: ").append(accountNumber);
		sb.append("Account Holder: ").append(accountHolderName);
		sb.append("Current Balance: ").append(balance);
		return sb.toString();
	}
}

//savings account
class SavingsAccount extends Account implements BankService
{
	SavingsAccount(int accNo, String name, String balance)
	{
		System.out.println("-------Saving Account--------");
		super(accNo, name, balance);
	}
		
	//method overriding
	void displayAccountDetails()
	{
		super.displayAccountDetails();
	}
	
	//deposit
	void deposit(double amount)
	{
		if(amount < 0){
			System.out.println("Invalid deposit amount!");
			return;
		}
		balance = balance + amount;
	}
	
	//overloaded deposit
	void deposit(double amount, double bonus)
	{
		if(amount < 0 || bonus < 0 )
		{
			System.out.println("Invalid deposit/bonus!");
			return;
		}
		balance = balance + (amount + bonus);
	}
	
	void withdraw(double amount)
	{
		if(amount < 0){
			System.out.println("Invalid withdrawl amount!");
		}else if(amount > balance){
			System.out.println("Insufficient balance!");
		}else{
			balance = balance - amount;
		}
	}
}

//current account
class CurrentAccount extends Account implements BankService
{
	SavingsAccount(int accNo, String name, String balance)
	{
		System.out.println("-------Current Account--------");
		super(accNo, name, balance);
	}
		
	//method overriding
	void displayAccountDetails()
	{
		super.displayAccountDetails();
	}
	
	//deposit
	void deposit(double amount)
	{
		if(amount < 0){
			System.out.println("Invalid deposit amount!");
			return;
		}
		balance = balance + amount;
	}
	
	//overloaded deposit
	void deposit(double amount, double bonus)
	{
		if(amount < 0 || bonus < 0 )
		{
			System.out.println("Invalid deposit/bonus!");
			return;
		}
		balance = balance + (amount + bonus);
	}
	
	void withdraw(double amount)
	{
		if(amount < 0){
			System.out.println("Invalid withdrawl amount!");
		}else if(amount > balance){
			System.out.println("Insufficient balance!");
		}else{
			balance = balance - amount;
		}
	}
}

//main class
class SmartBankingSystem 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Taking input
            System.out.print("Enter Account Number: ");
            int accNo = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Account Holder Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Initial Balance (String): ");
            String balanceStr = sc.nextLine();

            System.out.print("Choose Account Type (1-Savings, 2-Current): ");
            int choice = sc.nextInt();

            Account acc;

            // Create object
            if (choice == 1) {
                acc = new SavingsAccount(accNo, name, balanceStr);
            } else {
                acc = new CurrentAccount(accNo, name, balanceStr);
            }

            acc.displayAccountDetails();

            // Deposit
            System.out.print("\nEnter deposit amount: ");
            double depositAmt = sc.nextDouble();

            if (acc instanceof SavingsAccount) {
                ((SavingsAccount) acc).deposit(depositAmt);
            } else {
                ((CurrentAccount) acc).deposit(depositAmt);
            }

            // Withdraw
            System.out.print("Enter withdrawal amount: ");
            double withdrawAmt = sc.nextDouble();

            if (acc instanceof SavingsAccount) {
                ((SavingsAccount) acc).withdraw(withdrawAmt);
            } else {
                ((CurrentAccount) acc).withdraw(withdrawAmt);
            }

            // Show summary
            System.out.println(acc.generateSummary());

        } catch (Exception e) {
            System.out.println("Error: Invalid input!");
        }

        sc.close();
    }
}