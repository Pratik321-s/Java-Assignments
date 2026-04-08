//16. Write a program to check whether a number is palindrome.

import java.util.Scanner;

class Q16{

	public static void main(String []args){

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Number : ");

		int n = sc.nextInt();

		int RevNum = 0;

		int duplicate = n;

		while(n > 0){

			int ld = n % 10;
				
			RevNum = (RevNum * 10) + ld;
 			
			n = n / 10;
		}if(duplicate == RevNum){
			System.out.println("The Number is Palindrome");
		}else{
			System.out.println("The Number is not Palindrome");
		}
	}
}
