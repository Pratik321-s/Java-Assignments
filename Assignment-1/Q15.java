//15. Write a program to count digits in a number.

import java.util.Scanner;

class Q15{

	public static void main(String []args){

		Scanner sc = new Scanner(System.in);
		
			System.out.println("Enter Number : ");
			
			int n = sc.nextInt();

			int count = 0;

		while(n > 0){
		
			int ld = n % 10;
			
			count++;
			
			n = n / 10;

		}
		
		System.out.println("The count of the Number : " + count);

	}


}