//HamburgerJoint.java
package lesson1;

public class Food {
   
private String foodA;
    
    public Food (String A) {
        foodA = A;
    }

    public String getFood() {
        return foodA; //use return when a value is returned
    }
    
    void systemPrint() { //void only if nothing is returned
        System.out.println(foodA);
    }
}
