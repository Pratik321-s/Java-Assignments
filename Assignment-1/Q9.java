//9. Create a simple calculator using switch: 
//○ Input: two numbers + operator 
//○ Perform: +, -, *, / 

import java.util.Scanner;

class Calc{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Numbers and Operator");

		int a = sc.nextInt();
		char c = sc.next().charAt(0);
		int b = sc.nextInt();

		switch(c){

		case '+': 
			System.out.println("Addition of Two Numbers : " + (a+b));
			break;
		case '-':
			System.out.println("Subtraction of Two Numbers : " + (a-b));
			break;
		case '*':
			System.out.println("Multiplication of Two Numbers : " + (a*b)); 
			break;
		case '/':
			if(b != 0){
			System.out.println("Division of Two Numbers : " + (a/b));
			}else{
			System.out.println("Divisible by 0 Not Allowed");
			}
			break;
		default: 
			System.out.println("Invalid!");
			break;

		}

	}
}