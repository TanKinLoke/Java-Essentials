package Class;

/*  Classes in Java can be extended,
 *  creating new classes which retain characteristics of the base class
 */

public class MyClass {

	public static void main(String[] args) {
		Student mark = new Student(); //mark ==> object
                
		mark.setId(1);
		mark.setName("Mark");
		mark.setAge(15);
		
		Student tom = new Student();
		
		tom.setId(2);
		tom.setName("Tom");
		tom.setAge(14);
		
                //Method "StudentInfo" from "Student" class
		mark.StudentInfo();
                tom.StudentInfo();
	}

}
