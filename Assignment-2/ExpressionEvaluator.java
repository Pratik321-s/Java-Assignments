import java.util.Scanner;

class ExpressionEvaluator
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter value of a: ");
		int a = sc.nextInt();
		
		System.out.print("Enter value of b: ");
		int b = sc.nextInt();
		
		System.out.print("Enter value of c: ");
		int c = sc.nextInt();
		
		int result1 = (a + b) * c;
		boolean result2 = a > b && b > c;
		int result3 = a % b;
		
		System.out.println("(a + b) * c  = " + result1);
		System.out.println("a > b && b > c = " + result2);
		System.out.println("a % b = " + result3);
		
	}
}