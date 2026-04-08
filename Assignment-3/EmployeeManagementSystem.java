import java.util.ArrayList;

class Employee
{
	int empId;
	String name;
	double baseSalary;
	
	Employee(int empId, String name, double baseSalary)
	{
		this.empId = empId;
		this.name = name;
		this.baseSalary = baseSalary;
	}
	
	double calculateSalary()
	{
		return baseSalary;
	}
	
	double calculateSalary(double allowance)
	{
		return baseSalary + allowance;
	}
	
	double calculateSalary(double allowance, double bonus)
	{
		return baseSalary + allowance + bonus;
	}
	
	void displayEmployee()
	{
		System.out.println("Employee ID: " + empId);
		System.out.println("Name: " + name);
		System.out.println("Final Salary: " + salary);
	}
}

class EmployeeManagementSystem
{
	public static void main(String []args)
	{
		ArrayList<Employee> employees = new ArrayList<>();
		
		Employee e1 = new Employee(1, "Rahul", 30000);
		Employee e2 = new Employee(2, "Jainil", 40000);
		Employee e3 = new Employee(3, "Shyam", 35000);
		
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		
		double totalEmployees = employees.size();
		
		e1.displayEmployee(e1.calculateSalary());
		e2.displayEmployee(e2.calculateSalary(5000));
		e3.displayEmployee(e3.calculateSalary(4000, 3000));
		
		System.out.println("Total Employees: " + totalEmployees);
	}
}