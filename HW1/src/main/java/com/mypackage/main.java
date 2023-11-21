package main.java.com.mypackage;


import main.java.com.mypackage.operations.Addition;
import main.java.com.mypackage.operations.Subtraction;
import main.java.com.mypackage.operations.Multiplication;
import main.java.com.mypackage.operations.Division;

public class main {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        System.out.println("Addition: " + Addition.add(a, b));
        System.out.println("Subtraction: " + Subtraction.subtract(a, b));
        System.out.println("Multiplication: " + Multiplication.multiply(a, b));
        System.out.println("Division: " + Division.divide(a, b));
    }
}
