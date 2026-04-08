import java.util.Scanner;

class Q36
{
	public static void main(String []args)
	{
		int a, b, gcd, lcm;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Two Numbers : ");
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		int x = a;
		int y = b;
		
		while(b != 0)
		{
			int r = a % b;
			a = b;
			b = r;
		}
		
		gcd = a;
		
		lcm = (x * y) / gcd;
		
		System.out.println("LCM : " + lcm);
	}
}