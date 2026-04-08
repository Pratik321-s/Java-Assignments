import java.util.*;

class ReportGenerator
{
	public static <T> void generateReport(T []data)
	{
		System.out.println("----Report Start----");
		
		for(T item : data)
		{
			System.out.println(item);
		}
		
		System.out.println("----Report End----");
	}
	
	public static <T> void generateReportList(List<T> data)
	{
		System.out.println("----Report Start----");
		
		for(T item : data)
		{
			System.out.println(item);
		}
		
		System.out.println("----Report End----");
	}
	
	public static void main(String []args)
	{
		Double []sales = {1200.50, 3400.75, 2999.36};
		System.out.println("Sales Report: ");
		generateReport(sales);
		
		String []employees = {"Alice", "Bob", "Charlie"};
		System.out.println("Employee Report: ");
		generateReport(employees);
		
		List<Integer> productIDs = Arrays.asList(101, 102, 103);
		System.out.println("Product ID Report: ");
		generateReportList(productIDs);
	}
}