//25. Write a program to swap two numbers: 
//With third variable 
//Without third variable


class Q25{

	public static void main(String []args){
	
		int a = 5;

		int b = 9;

		System.out.println("------------ With Third Variable --------------");
 
		System.out.println("Before Swap : " + " a = " + a + " " + " b = " + b);
		
			int c = a;

			a = b;

			b = c;

		System.out.println("After Swap : " + " a = " + a + " " + " b = " + b);

		System.out.println("---------- Without Third Variable -----------");

		System.out.println("Before Swap : " + " a = " + a + " " + " b = " + b);

			a = a + b;

			b = a - b;

			a = a - b;

		System.out.println("After Swap : " + " a = " + a + " " + " b = " + b);
	}



}