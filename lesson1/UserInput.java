package lesson1;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		System.out.println("Enter some number");
		int user_input_number = scan.nextInt();

		System.out.println("The entered number is");
		System.out.println(user_input_number);
			
		Scanner scan1=new Scanner (System.in);
		System.out.println("Enter some decimal value");
		double user_input_double = scan1.nextDouble();
		
		System.out.println("The entered value is");
		System.out.println(user_input_double);
/*
Alphabet would use String and scan2.nextLine
 */
		Scanner scan2=new Scanner (System.in);
		System.out.println("Enter a text");
		String user_input_string = scan2.nextLine();
		
		System.out.println("The entered string is");
		System.out.print(user_input_string);
		
		
	}

}
