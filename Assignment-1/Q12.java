//12. Write a program to print sum of first N natural numbers.


import java.util.Scanner;

class Q12{

	public static void main(String []args){

	Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Number : ");		

		int n = sc.nextInt();

		for(int i = 1; i <= n; i++){
			System.out.println("The Natural Numbers are : " + i);
		}

	}

}