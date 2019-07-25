package lesson1;

public class Math {

	public static void main(String[] args) {
		int x , y , answer;
		x = 20;
		y = 30;
		answer = x + y;
		/*
		 The + is use for combine 2 strings.
		 + plus
		 - minus
		 * multiply
		 / divide
		 % remainder
		 */
		System.out.println("Answer = " + answer);
		
		/*
		 When divide, int makes 3 numbers into integer. Which means if the answer is not
		 an integer, the value would be 0.
		 If 70 divide by 30, the answer would be 2(because its 2.3)
		 Use "double" would be best.
		 */
		 double m , n , answers;
		 m = 70;
		 n = 30;
		 answers = m / n;
		 
		 System.out.println("The answer = " + answers);
		 
		

	}

}
