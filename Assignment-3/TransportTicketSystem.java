import java.util.ArrayList;

class Ticket
{
	int ticketId;
	String passengerName;
	String source;
	String destination;
	double fare;
	
	Ticket(int ticketId, String passengerName, String source, String destination, double fare)
	{
		this.ticketId = ticketId;
		this.passengerName = passengerName;
		this.source = source;
		this.destination = destination;
		this.fare = fare;
	}
	
	void updateFare(double newFare)
	{
		this.fare = newFare;
	}
		
	void calculateFare()
	{
		return fare;
	}
	
	void displayTicket()
	{
		System.out.println("Ticket ID: " + ticketId);
		System.out.println("Passenger Name: " + passengerName);
		System.out.println("Source: " + source);
		System.out.println("Destination: " + destination);
		System.out.println("Fare: " + fare);
	}
}

class TransportSystem
{
	public static void main(String []args)
	{
		ArrayList<Ticket> tickets = new ArrayList<>();
		
		Ticket t1 = new Ticket(1, "Rahul", "Mumbai", "Pune", 500);
		Ticket t2 = new Ticket(2, "Jainil", "Delhi", "Jaipur", 800);
		Ticket t3 = new Ticket(3, "Amit", "Chennai", "Bangalore", 600);
		
		tickets.add(t1);
		tickets.add(t2);
		tickets.add(t3);
		
		t1.updateFare(550);
		
		double totalFare = 0;
		
		for(Ticket t : tickets)
		{
			t.displayTicket();
			totalFare = totalFare + t.calculateFare();
		}
		
		System.out.println("Total Fare of All Tickets: " + totalFare);
	}
}