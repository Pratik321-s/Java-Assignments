import java.util.Scanner;

class StudentResult
{
	static int calculateTotal(int marks[])
	{
		int total = 0;
		for(int i = 0; i < 5; i++)
		{
			total = total + marks[i];
		}
		
		return total;
	}
	
	static double calculateAverage(int total)
	{
		return total / 5.0;
	}
	
	static double calculatePercentage(int total)
	{
		return (total / 500.0) * 100; 
	}
	
	static String findGrade(double percentage)
	{
		if(percentage >= 90)
		{
			return "A";
		}else if(percentage >= 75)
		{
			return "B";
		}else if(percentage >= 60)
		{
			return "C";
		}else if(percentage >= 40)
		{
			return "D";
		}else{
			return "Fail";
		}
	}
	
	static String checkPromotion(double percentage)
	{
		if(percentage < 40)
		{
			return "Not Promoted";
		}else{
			return "Promoted";
		}
	}
	
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		
		String name;
		int roll;
		int marks[] = new int[5];
		
		System.out.print("Enter Student Name : ");
		name = sc.nextLine();
		System.out.print("Enter Roll Number : ");
		roll = sc.nextInt();
		System.out.print("Enter Marks of 5 Subjects : ");
		for(int i = 0; i < 5; i++)
		{
			marks[i] = sc.nextInt();
		}
		
		int total = calculateTotal(marks);
		double average = calculateAverage(total);
		double percentage = calculatePercentage(total);
		String grade = findGrade(percentage);
		String promotion = checkPromotion(percentage);
		
		System.out.println("Name : " + name);
		System.out.println("Roll Number : " + roll);
		System.out.println("Total Marks : " + total);
		System.out.println("Average : " + average);
		System.out.println("Percentage : " + percentage + "%");
		System.out.println("Grade : " + grade);
		System.out.println("Status : " + promotion);
	}
}