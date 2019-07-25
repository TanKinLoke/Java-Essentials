package lesson1;

import java.util.Scanner;

public class FirstLesson {

	public static void main(String[] args) {
		int A ;
		int B ;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("What is X? ");
		String X = scan.next();
		// After the word "next", it become word
		System.out.println("What is Y? ");
		String Y = scan.next();
		// X+Y is a character X+Y=XY, means 5+6=56
		// Integer.parseInt make it become integer
		System.out.println(X+"+"+Y);
		A = Integer.parseInt(X);
		B = Integer.parseInt(Y);
		System.out.println(A+B);
	}

}
