class Vehicle
{
	String brand;
	int speed;
	String fuelType;
	double mileage;
	
	static
	{
		System.out.println("Fleet Management System Initialized");
	}
	
	{
		System.out.println("Vehicle object is being created..");
	}
	
	Vehicle(String brand, int speed, String fuelType, double mileage)
	{
		this.brand = brand;
		this.speed = speed;
		this.fuelType = fuelType;
		this.mileage = mileage;
	}
	
	void updateSpeed(int newSpeed)
	{
		this.speed = newSpeed;
		System.out.println("Speed updated to: " + speed);
	}
	
	void displayDetails()
	{
		System.out.println("Brand: " + brand);
		System.out.println("Speed: " + speed + " km/h");
		System.out.println("Fuel Type: " + fuelType);
		System.out.println("Mileage: " + mileage + " km/l");
	}
}

class Car extends Vehicle
{
	Car(String brand, int speed, String fuelType, double mileage)
	{
		super(brand, speed, fuelType, mileage);
	}
	
	void displayDetails()
	{
		super.displayDetails();
	}
}

class Bike extends Vehicle
{
	Bike(String brand, int speed, String fuelType, double mileage)
	{
		super(brand, speed, fuelType, mileage);
	}
	
	void displayDetails()
	{
		super.displayDetails();
	}
}

public class FleetManagementSystem
{
	public static void main(String []args)
	{
		Car car1 = new Car("Toyota", 120, "Petrol", 15.5);
		car1.updateSpeed(140);
		car1.displayDetails();
		
		Bike bike1 = new Bike("Yamaha", 80, "Petrol", 40);
		bike1.updateSpeed(90);
		bike1.displayDetails();
	}
}