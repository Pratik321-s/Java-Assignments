import java.util.Scanner;

class DailyExpenseTracker
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		
		double []expenses = new double[7];
		double total = 0;
		double highest, lowest, average;
		int highestDay = 0;
		
		//accept expenses of 7 days
		System.out.println("Enter expenses for 7 days : ");
		
		for(int i = 0; i < 7; i++)
		{
			System.out.print("Day " + (i + 1) + ": ");
			expenses[i] = sc.nextDouble();
			total = total + expenses[i];
		}
		
		//first day as highest and lowest
		highest = expenses[0];
		lowest = expenses[0];
		
		//for highest, lowest, day of highest expense
		for(int i = 1; i < 7; i++)
		{
			if(expenses[i] > highest)
			{
				highest = expenses[i];
				highestDay = i;
			}
			
			if(expenses[i] < lowest)
			{
				lowest = expenses[i];
			}
		}
		
		average = total / 7;
		
		System.out.println("Total Expense = " + total);
		System.out.println("Average Expense = " + average);
		System.out.println("Highest Expense = " + highest);
		System.out.println("Lowest Expense = " + lowest);
		System.out.println("Highest Expense of the Day " + (highestDay + 1));
	}
}