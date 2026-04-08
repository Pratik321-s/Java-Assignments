class Patient
{
	int patientID;
	String patientName;
	int age;
	String disease;
	
	Patient(int id, String name, int age, String disease)
	{
		this.patientID = id;
		this.patientName = name;
		this.age = age;
		this.disease = disease;
	}
	
	void displayDetails()
	{
		System.out.println("Patient ID : " + patientID);
		System.out.println("Patient Name : " + patientName);
		System.out.println("Age : " + age);
		System.out.println("Disease : " + disease);
	}
	
	void checkSeniorCitizen()
	{
		if(age >= 60){
			System.out.println("Senior Citizen : YES");
		}else{
			System.out.println("Senior Citizen : NO");
		}
	}
}

class HospitalPatientRecord
{
	public static void main(String []args)
	{
		Patient p1 = new Patient(101, "Rahul", 25, "Fever");
		Patient p1 = new Patient(102, "Meena", 65, "Diabetes");
		Patient p1 = new Patient(103, "Amit", 75, "Heart Problem");
		
		p1.displayDetails();
		p1.checkSeniorCitizen();
		
		p2.displayDetails();
		p2.checkSeniorCitizen();
		
		p3.displayDetails();
		p3.checkSeniorCitizen();
	}
}