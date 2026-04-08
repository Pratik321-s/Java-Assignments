import java.util.ArrayList;

class Course
{
	int courseId;
	String courseName;
	double fees;
	
	Course(int courseId, String courseName, double fees)
	{
		this.courseId = courseId;
		this.courseName = courseName;
		this.fees = fees;
	}
	
	void display()
	{
		System.out.println("Course ID: " + courseId);
		System.out.println("Course Name: " + courseName);
		System.out.println("Fees: " + fees);
	}
}


class Student
{
	int studentId;
	String name;
	
	ArrayList<Course> enrolledCourses = new ArrayList<>();
	
	Student(int studentId, String name)
	{
		this.studentId = studentId;
		this.name = name;
	}
	
	void enrollCourse(Course c)
	{
		enrolledCourses.add(c);
		System.out.println(name + " enrolled in " + c.courseName);
	}
	
	void displayCourses()
	{
		System.out.println("Student ID: " + studentId);
		System.out.println("Name: " + name);
		System.out.println("Enrolled Courses: ");
		
		for(Course c : enrolledCourses){
			c.displayCourses();
		}
	}
}
