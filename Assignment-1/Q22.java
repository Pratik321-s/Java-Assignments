//22. Write a program to check whether a number is prime.


import java.util.Scanner;

class Q22{

	public static void main(String []args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Number : ");

		int n = sc.nextInt();

		boolean Prime = true;

		for(int i = 2; i <= n / 2; i++){
		
			if(n % i == 0){
				
				Prime = false;
				break;
			}
		}
		
		if(Prime){
			System.out.println(n + " is a Prime Number");
		}else{
			System.out.println(n + " is not a Prime Number");
		}
	}
	
}