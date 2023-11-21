package main.java.com.mypackage;

import main.java.com.mypackage.operations.Addition;
import main.java.com.mypackage.operations.Subtraction;
import main.java.com.mypackage.operations.Multiplication;
import main.java.com.mypackage.operations.Division;
import main.java.com.mypackage.operations.Decorator;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число (a): ");
        int a = scanner.nextInt();

        System.out.print("Введите второе число (b): ");
        int b = scanner.nextInt();

        System.out.println("Выберите операцию: ");
        System.out.println("1. Сложение");
        System.out.println("2. Вычитание");
        System.out.println("3. Умножение");
        System.out.println("4. Деление");

        int choice = scanner.nextInt();
        int result = 0;

        switch (choice) {
            
            case 1:
                result = Addition.add(a, b);
                break;
            case 2:
                result = Subtraction.subtract(a, b);
                break;
            case 3:
                result = Multiplication.multiply(a, b);
                break;
            case 4:
                result = Division.divide(a, b);
                break;
            default:
                System.out.println("Неверный выбор операции.");

        }

        System.out.println(Decorator.decorate(result));

        scanner.close();

    }
}
