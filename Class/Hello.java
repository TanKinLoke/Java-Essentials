package Class;
/*
Final keyword has a numerous way to use:

A final class cannot be subclassed.
A final method cannot be overridden by subclasses
A final variable can only be initialized once
*/
public class Hello extends Student {
    public final int number;
    
    Hello () {
        number = 10;
    }
}
