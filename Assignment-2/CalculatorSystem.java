class CalculatorSystem
{
	static void calculate(int a, int b)
	{
		int result = a + b;
		System.out.println("Addition of two integers = " + result);
	}
	
	static void calculate(double a, double b)
	{
		double result = a + b;
		System.out.println("Addition of two double numbers = " + result);
	}
	
	static void calculate(int a, int b, int c)
	{
		int result = a + b + c;
		System.out.println("Addition of three integers = " + result);
	}
	
	public static void main(String []args)
	{
		calculate(10, 20);
		calculate(10.50, 10.50);
		calculate(5, 10, 15);
	}
}