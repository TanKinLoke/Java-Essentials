package lesson1;

public class Arrays {

	public static void main(String[] args) {
		int[] myintarray = {100,31,26,48,52};
		// the number in the array call index
		// index start with 0, so the number 100 is index 0
		/*
		 int[] myIntArray = new int [3];
		 int[] myIntArray = {1,2,3};
		 int[] myIntArray = new int [] {1,2,3};
		 */
		// while command cannot put 6 because the size of the array is just 5
		int index = 0;
		while (index < 5) {
		System.out.println(myintarray[index]);
		index++;
		}

	}

}
