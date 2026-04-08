//5. Take a character input and print: 
//○ Next character 
//○ Previous character

import java.util.Scanner;

class Input{

	public static void main(String []args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a character : ");
		
		char c = sc.next().charAt(0);

		char next = (char) (c + 1);
		System.out.println("Next character : " + next);

		char previous = (char) (c - 1);
		System.out.println("Previous character : " + previous);

	}

}