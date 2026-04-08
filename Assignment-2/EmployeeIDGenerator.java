class Employee
{
	static int counter = 1000;
	
	int empId;
	String name;
	String department;
	
	Employee(String name, String department)
	{
		counter++;
		empId = counter;
		this.name = name;
		this.department = department;
	}
	
	void displayEmployee()
	{
		System.out.println("Employee ID: " + empId);
		System.out.println("Name: " + name);
		System.out.println("Department: " + department);
	}
	
	public static void main(String []args)
	{
		Employee e1 = new Employee("Rahul", "IT");
		Employee e1 = new Employee("Sneha", "HR");
		Employee e1 = new Employee("Amit", "Finance");
		
		e1.displayEmployee();
		e2.displayEmployee();
		e3.displayEmployee();
	}
}