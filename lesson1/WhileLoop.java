package lesson1;

public class WhileLoop {

	public static void main(String[] args) {
		int a = 0;
		
		// a++ means a+1, so it rerun again, again and again
		// while loop makes the code run again automatically
		while (a <= -1)
		{
			System.out.println(a);
			a--;
		}
		// It will do the below command if the statement is false^^^
			System.out.println("---------------------------------");
		
		// Do-While Loop
		// It execute the command first because "do" first.
		// If the statement is false, it will at least run the "do" command
		// If the statement is true, it will continue run again the command
		int b = 0;
		do {
				System.out.println(b);
				b++;
		} while (b <= -1);
	}

}
