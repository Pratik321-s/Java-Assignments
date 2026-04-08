import java.util.Scanner;

class WeeklyHours
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number of employees: ");
		int employees = sc.nextInt();
		
		int [][]workHours = new int [employees][];
		
		for(int i = 0; i < employees; i++)
		{
			System.out.print("Enter number of working days for employees " + (i+1) + ": ");
			int days = sc.nextInt();
			
			workHours[i] = new int[days];
			
			for(int j = 0; j < days; j++)
			{
				System.out.print("Enter work hours for day " + (i+1) + ": ");
				workHours[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Weekly Work Hours of Employees: ");
		
		for(int i = 0; i < workHours.length; i++)
		{
			System.out.print("Employee " + (i+1) + ": ");
			
			for(int j = 0; j < workHours[i].length; j++)
			{
				System.out.print(workHours[i][j] + " ");
			}
			
			System.out.println();
		}
	}
}