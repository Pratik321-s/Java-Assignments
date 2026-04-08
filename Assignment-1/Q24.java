//24. Write a program to find largest digit in a number.


import java.util.Scanner;

class Q24{

	public static void main(String []args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Number : ");

		int n = sc.nextInt();

		int largest = 0;
		
		while(n > 0){

			int digit = n % 10;

			if(digit > largest){
				largest = digit;
			}
	
			n = n / 10;
		}

		System.out.println("The largest Digit from Number : " + largest);
	}

}