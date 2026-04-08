import java.util.Scanner;

class BusTicket
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		
		int []seats = new int[10];
		int choice, seatNo;
		
		while(true)
		{
			System.out.println("1. View Seats");
			System.out.println("2. Book Seats");
			System.out.println("3. Cancel Seats");
			System.out.println("4. Exit");
			System.out.println("Enter Choice : ");
			
			choice = sc.nextInt();
			
			if(choice == 1)
			{
				for(int i = 0; i < 10; i++)
				{
					if(seats[i] == 0)
					{
						System.out.println("Seat " + (i + 1) + " is Available");
					}else{
						System.out.println("Seat " + (i + 1) + " is Booked");
					}
				}else if(choice == 2)
				{
					System.out.print("Enter seat number (1-10) : ");
					seatNo = sc.nextInt();
					
					if(seats[seatNo - 1] == 1)
					{
						System.out.println("Seat Already Booked");
					}else{
						seats[seatNo - 1] = 1;
						System.out.println("Seat Booked Successfully");
					}
				}else if(choice == 3)
				{
					System.out.println("Enter Seat Number (1-10) : ");
					seatNo = sc.nextInt();
					
					if(seats[seatNo - 1] == 0)
					{
						System.out.println("Seat Already Available");
					}else{
						seats[seatNo - 1] = 0;
						System.out.println("Seat Cancelled Successfully");
					}
				}else if(choice == 4){
					break;
				}else{
					System.out.println("Invalid Choice !");
				}
			}
		}
	}
}