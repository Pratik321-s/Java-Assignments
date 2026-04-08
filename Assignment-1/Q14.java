//14. Write a program to reverse a number.

import java.util.Scanner;

class Q14{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Number : ");

		int n = sc.nextInt();

		int RevNum = 0;

		while(n > 0){
		
			int digit = n % 10;
			
			RevNum = (RevNum * 10) + digit;

			n = n / 10;

		}

		System.out.print("The Reversed Number is : " + RevNum);


	}

}