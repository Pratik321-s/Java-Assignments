import java.util.Scanner;

class EmployeeSalary
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Employee Name : ");
		String name = sc.nextLine();
		
		System.out.print("Enter Employee ID : ");
		int id = sc.nextInt();
		
		System.out.print("Enter Basic Salary : ");
		double basicSalary = sc.nextDouble();
		
		double hra = 0.20 * basicSalary;
		double da = 0.10 * basicSalary;
		double pf = 0.05 * basicSalary;
		
		double netSalary = basicSalary + hra + da - pf;
		
		System.out.println("Employee Name : " + name);
		System.out.println("Employee ID : " + id);
		System.out.println("Basic Salary : " + basicSalary);
		System.out.println("HRA (20%) : " + hra);
		System.out.println("DA (10%) : " + da);
		System.out.println("PF (8%) : " + pf);
		System.out.println("Net Salary : " + netSalary);
	}
}