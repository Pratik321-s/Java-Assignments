import java.util.*;

class Student
{
	int rollNumber;
	String name;
	String phone;
	String email;
	ArrayList<Integer> marks;
	
	Student(int rollNumber, String name, String phone, String email)
	{
		this.rollNumber = rollNumber;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.marks = new ArrayList<>();
	}
	
	void addMark(int mark)
	{
		marks.add(mark);
	}
	
	int calculateTotal()
	{
		int total = 0;
		for(int m : marks)
		{
			total = total + m;
		}
		
		return total;
	}
	
	double average()
	{
		if(marks.size() == 0) return 0;
		
		return (double) calculateTotal() / marks.size();
	}
	
	void displayReport()
	{
		System.out.println("Roll Number: " + rollNumber);
		System.out.println("Name: " + name);
		System.out.println("Phone: " + phone);
		System.out.println("Email: " + email);
		System.out.println("Marks: " + marks);
		System.out.println("Total Marks: " + calculateTotal());
		System.out.println("Average Marks: " + average());
	}
}

public class CollegeERP
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<Student> students = new ArrayList<>();
		
		System.out.print("Enter number of student: ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++)
		{
			System.out.println("Enter details for student " + (i + 1));
			
			System.out.print("Roll Number: ");
			int roll = sc.nextInt();
			sc.nextLine();
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Phone: ");
			String phone = sc.nextLine();
			
			System.out.print("Email: ");
			String email = sc.nextLine();
			
			Student s = new Student(roll, name, phone, email);
			
			System.out.print("Enter number of subjects: ");
			int subjects = sc.nextInt();
			
			for(int j = 0; j < subjects; j++){
				System.out.print("Enter marks for subject " + (j + 1) + ": ");
				int mark = sc.nextInt();
				s.addMark(mark);
			}
			
			students.add(s);
		}
		
		for(Student s : students)
		{
			s.displayReport();
		}
		
		System.out.println("Total Students Admitted: " + students.size());
	}
}