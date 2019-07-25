package lesson1;

public class ParameterPassingAndReturning {

	public static void main(String[] args) {
		sayHello("John");
		sayHello("Mark");
		sayHello("Tom");
		Add(3,4,5);
		Add(255,500,300);
		int sum = Add2(1,2,3);
		System.out.println(sum);
	}
	
	public static void sayHello(String name) {
		System.out.println("Hello " + name);
	}
	
	public static void Add(int a,int b,int c) {
		System.out.println(a+b+c);
	}
	
	public static int Add2(int a,int b,int c) {
                int sum = a+b+c;
		System.out.println(sum);
                return sum;
        }

}
