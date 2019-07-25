package lesson1;

public class IncrementAndAssignment {

	public static void main(String[] args) {
		int x=10;
		x = x + 1;
		/*
		 Also can use "x++;" to replace the above code.
		 Cannot put "x++" into the print code because the it won't perform the ++ operation
		 Can use "++x" because it would perform the ++ operation
		 */
		System.out.println(x);
		
		int y=20;
		y +=5;
		/*
		"y +=5" is same as "y = y + 5"
		 */
		System.out.println(y);
		
		int z=30;
		z *=5;
		/*
		 You can also change the + to any like *
		 */
		System.out.println(z);

	}

}
