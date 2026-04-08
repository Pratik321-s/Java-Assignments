//13. Write a program to print multiplication table of a number.

import java.util.Scanner;

class Q13{

	public static void main(String []args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the Number : ");

		int n = sc.nextInt();

		for(int i = 1; i <= 10; i++){
			System.out.println(n + " x " + i + " = " + (n*i));
		}

	}


}