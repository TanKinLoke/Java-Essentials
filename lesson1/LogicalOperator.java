package lesson1;

public class LogicalOperator {

	public static void main(String[] args) {
		int subject1 = 40;
		int subject2 = 60;
		 /*
		   && -> AND		|| -> OR
		  */
		if ((subject1 >= 35) && (subject2 >=45)) {
			System.out.println("the condition is true");
		}
		else {
			System.out.println("the condition is false");
		}
		int subject3 = 40;
		int subject4 = 60;
		int subject5 = 80;
		/*
		 Operators:
		 // && -> AND		|| -> OR
		 */
		if ((subject3 >= 35) && (subject4 >=45) && (subject5 >= 55)) {
			System.out.println("the condition is true");
		}
		else {
			System.out.println("the condition is false");
		}
	}

}
