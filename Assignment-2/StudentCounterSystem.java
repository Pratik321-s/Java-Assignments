class Student
{
	String name;
	int rollNo;
	
	static int totalStudents = 0;
	
	Student(String n, int r)
	{
		name = n;
		rollNo = r;
		
		totalStudents++;
	}
	
	void displayStudents()
	{
		System.out.println("Name : " + name);
		System.out.println("Roll No. : " + rollNo);
	}
	
	static void displayTotalStudents()
	{
		System.out.println("Total Students = " + totalStudents);
	}
}

class StudentCounter
{
	public static void main(String []args)
	{
		Student s1 = new Student("Rahul", 101);
		Student s2 = new Student("Priya", 102);
		Student s3 = new Student("Amit", 103);
		
		s1.displayStudents();
		s2.displayStudents();
		s3.displayStudents();
		
		Student.displayTotalStudents();
	}
}