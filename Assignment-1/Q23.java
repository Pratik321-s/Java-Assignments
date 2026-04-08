//23. Write a program to find sum of even and odd numbers separately (1 to N). 

import java.util.Scanner;

class Q23{

	public static void main(String []args){
	
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Number : ");

		int n = sc.nextInt();

		int evenSum = 0; 
		int oddSum = 0;
		
		for(int i = 1; i <= n; i++){
			
			if(i % 2 == 0){
				evenSum = evenSum + i;
			}else{
				oddSum = oddSum + i;
			}
		}

		System.out.println("The Sum of Even Numbers : " + evenSum);

		System.out.println("The Sum of Odd Numbers : " + oddSum);

	}

}