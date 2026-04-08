//7. Write a program to find the largest of three numbers.

import java.util.Scanner;

class Largest{

	public static void main(String []args){

		Scanner sc = new Scanner(System.in);

			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();

			if(a >= b && a >= c){
				System.out.println("Largest : " + a);
			}else if(b >= a && b >= c){
				System.out.println("Largest : " + b);
			}else{
				System.out.println("Largest : " + c); 
			}

	}

}