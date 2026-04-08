import java.util.ArrayList;

class ContactDetails
{
	String phone;
	String address;
	
	ContactDetails(String phone, String address)
	{
		this.phone = phone;
		this.address = address;
	}
	
	void displayContact()
	{
		System.out.println("Phone: " + phone);
		System.out.println("Address: " + address);
	}
}

class Patient
{
	int patientId;
	String name;
	int age;
	String disease;
	
	ContactDetails contact;
	
	Patient(int patientId, String name, int age, String disease, ContactDetails contact)
	{
		this.patientId = patientId;
		this.name = name;
		this.age = age;
		this.disease = disease;
		this.contact = contact;
	}
	
	boolean isSeniorCitizen()
	{
		return age >= 60;
	}
	
	void displayPatient()
	{
		System.out.println("Patient ID: " + patientId);
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Disease: " + disease);
		
		contact displayContact();
		
		if(isSeniorCitizen()){
			System.out.println("Status: Senior Citizen");
		}else{
			System.out.println("Status: Normal");
		}
	}
}

class HospitalManagementSystem
{
	public static void main(String []args)
	{
		ArrayList<Patient> patients = new ArrayList<>();
		
		ContactDetails c1 = new ContactDetails("9653485765", "Mumbai");
		Patient p1 = new Patient(1, "Rahul", 65, "Diabetes", c1);
		
		ContactDetails c2 = new ContactDetails("9568784598", "Pune");
		Patient p2 = new Patient(2, "Jainil", 45, "Fever", c2);
		
		ContactDetails c3 = new ContactDetails("9968745695", "Delhi");
		Patient p3 = new Patient(3, "Shyam", 70, "Heart Issue", c3);
		
		patients.add(p1);
		patients.add(p2);
		patients.add(p3);
		
		for(Patient p : patients)
		{
			p.displayPatient();
		}
		
		System.out.println("Total Patients: " + patients.size());
	}
}