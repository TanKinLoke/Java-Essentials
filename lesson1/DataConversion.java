package lesson1;


public class DataConversion {

    public static void main(String[] args) {
        double source = 150.9999999;
        int destination = (int) source; //change double to int
        
        int I = 125;
        byte B = (byte) I; //-127 to 127 == this is an explicit cast
        
        //int Integer
        //char Character
        //byte Byte
        
        //Object is different with variable
        Integer wholeNumber = new Integer (400);
        int dest = wholeNumber.intValue();
        
        String val = "47"; //This is a variable, not number
        int intObject = Integer.parseInt(val);
        
        int x = 47;
        double y = 3.5;
        double xy = x+y;  //Java automatically change x to double
        
        //It always round down, no round up
        System.out.println(source);
        System.out.println(destination);
        System.out.println(B);
        System.out.println(dest);
        System.out.println(intObject);
        System.out.println(xy);
    }
    
}
