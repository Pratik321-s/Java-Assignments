import java.util.Scanner;

class Q35
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Two Number : ");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int r;
		
		while(b != 0)
		{
			r = a % b;
			a = b;
			b = r;
		}
		
		System.out.println("GCD : " + a);
	}
}