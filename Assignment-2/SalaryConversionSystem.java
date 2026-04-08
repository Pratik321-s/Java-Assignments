class SalaryConversion
{
	public static void main(String []args)
	{
		double salary = 45875.89;
		
		int intSalary = (int) salary;

		float floatSalary = (float) salary;
		
		System.out.println("Original Salary (double): " + salary);
		System.out.println("Converted Salary (int): " + intSalary);
		System.out.println("Converted Salary (float): " + floatSalary);
	}
}