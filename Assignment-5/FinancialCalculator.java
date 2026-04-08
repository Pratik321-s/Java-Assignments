import java.util.*;

class FinancialCalculator
{
	public static <T extends Number> void calculate(T []data)
	{
		double sum = 0.0;
		
		for(T sum : data)
		{
			sum = sum + num.doubleValue();
		}
		
		double average = sum / data.length;
		
		System.out.println("----Financial Report----");
		System.out.println("Sum: " + sum);
		System.out.println("Average: " + average);
	}
	
	public static void main(String []args)
	{
		Integer []transactions = {1000, 2000, 3000, 4000};
		System.out.println("Transaction Data: ");
		calculate(transactions);
		
		Double []salaries = {25000.50, 30000.75, 28000.25};
		System.out.println("Salary Data: ");
		calculate(salaries);
	}
}