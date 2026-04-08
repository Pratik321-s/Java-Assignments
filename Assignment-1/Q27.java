//27. Take marks of 5 subjects and: 
//Calculate total 
//Calculate percentage 
//Print grade (A/B/C/Fail)

import java.util.Scanner;

class Q27{

	public static void main(String []args){

		Scanner sc = new Scanner(System.in);
	
			System.out.println("Enter Marks of 5 Subjects : ");

			int a1 = sc.nextInt();
			int a2 = sc.nextInt();
			int a3 = sc.nextInt();
			int a4 = sc.nextInt();
			int a5 = sc.nextInt();	

			int total = a1 + a2 + a3 + a4 + a5;

			System.out.println("Total Marks : " + total);

			double percentage = (total / 500.0) * 100;

			System.out.println("Percentage : " + percentage + "%");
		
			if(percentage >= 90){
				System.out.println("Grade A");
			}else if(percentage >= 75 && percentage <= 89){
				System.out.println("Grade B");
			}else if(percentage >= 35 && percentage <= 74){
				System.out.println("Grade C");
			}else{
				System.out.println("Fail");
			}
	}
	

}