//10. Write a program to check whether a character is: 
//Vowel or consonant

import java.util.Scanner;

class Q10{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Alphabet : ");

		char c = sc.next().toLowerCase().charAt(0);

		if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
			System.out.println(c + " is a Vowel");
		}else if(c >= 'a' && c <= 'z'){
			System.out.println(c + " is a Consonant");
		}else{
			System.out.println("Invalid!");
		}


	}

}