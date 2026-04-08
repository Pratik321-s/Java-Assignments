//28. Take user age and: 
//Check eligibility for voting 


import java.util.Scanner;

class Q28{

	public static void main(String []args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Age : ");

		int age = sc.nextInt();

		if(age >= 18){
			System.out.println("You are Eligible for Voting.");
		}else{
			System.out.println("You are Not Eligible for Voting!");
		}		

	}

}