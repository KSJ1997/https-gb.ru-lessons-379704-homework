package main.java.com.mypackage.operations;

public class Division {
    
    public static int divide(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Cannot divide by zero!");
            return 0;
        }
    }
}
