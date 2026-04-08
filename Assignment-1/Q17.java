//17. Write a program to find factorial of a number.

import java.util.Scanner;

class Q17{

	public static void main(String []args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Number : ");

		int n = sc.nextInt();

		int result = 1;

		for(int i = 1; i <= n; i++){
			result = result * i;			
		}
		
		System.out.println("The Factorial is : " + result);
			
	}

}