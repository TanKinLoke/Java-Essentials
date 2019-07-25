package Class;

public class Student {
	int id;
	String name;
	int age;
	
        public void StudentInfo() {
            System.out.println("Student number "+id);
            System.out.println("Name: "+name);
            System.out.println("Age: "+age);
        }
        
/*Access Levels
Modifier        Class    Package Subclass World
public            Y         Y       Y       Y
protected         Y         Y       Y       N
no modifier       Y         Y       N       N
private           Y         N       N       N
*/

//	Prevent unknown people from hacking the variables
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
