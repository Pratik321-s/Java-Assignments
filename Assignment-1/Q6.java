//6. Write a program to check whether a number is: 
//○ Positive 
//○ Negative 
//○ Zero

import java.util.Scanner;

class Number{

	public static void main(String []args){
	
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();

		if(num > 0){
			System.out.println("Positive");
		}else if(num < 0){
			System.out.println("Negative");
		}else{
			System.out.println("Zero");
		}


	}

}