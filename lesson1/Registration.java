package lesson1;

public class Registration {
    private String usernameA; //Object or Instance variable
    private static int username = 0; //Static variable
    
    public Registration (String A) {
        usernameA= A;
        username++;
    }
    
    public String putUsernameDatabase() { //Return Method
        return usernameA;
    }
    
    public static int getfoodCount() { //Static Method
        return username;
    }
}
