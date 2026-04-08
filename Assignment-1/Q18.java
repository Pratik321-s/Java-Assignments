//18. Write a program to print Fibonacci series up to N terms.

import java.util.Scanner;

class Q18{

	public static void main(String []args){

		Scanner sc = new Scanner(System.in);
			
		int n = sc.nextInt();
		
		int first = 0;

		int second = 1;

		System.out.println(first + " " + second);

		for(int i = 0; i <= n; i++){
		
			int next = first + second;

			System.out.println(" " + next + " ");

			first = second;

			second = next;
		
		}
		
	}

}