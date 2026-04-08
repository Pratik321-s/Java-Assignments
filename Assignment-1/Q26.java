//26. Write a program to check whether a number is Armstrong.


import java.util.Scanner;

class Q26{

	public static void main(String []args){
	
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Enter a Number : ");

		int n = sc.nextInt();
	
		int original = n;

		int sum = 0;

		while(n > 0){
	
			int digit = num % 10;

			int cube = digit * digit * digit;

			sum = sum + cube;

			n = n / 10;
		}

		if(sum == original){
			System.out.println("It is an Armstrong number.");
		}else{
			System.out.println("It is NOT an Armstrong number.");
		}

	}
}