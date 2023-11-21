package main.java.com.mypackage.operations;

public class Division {
    
    public static int divide(int a, int b) {

        if (b != 0) {

            return a / b;

        } else {

            System.out.println("Невозможно разделить на ноль!");

            return 0;
            
        }
    }
}
