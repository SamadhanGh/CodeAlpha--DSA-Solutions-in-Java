package Backtrackig_Class;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of a:");
        int a = sc.nextInt();

        System.out.println("Enter the value of b:");
        int b = sc.nextInt();

        System.out.println("Sum: " + Sum(a, b));
        System.out.println("Difference: " + Sub(a, b));
        System.out.println("Product: " + Multiply(a, b));
        System.out.println("Division: " + Div(a, b));
        System.out.println("Percentage: " + Percentage(a, b));

        sc.close();
    }

    public static int Sum(int a, int b) {
        return a + b;
    }

    public static int Sub(int a, int b) {
        return a - b;
    }

    public static int Multiply(int a, int b) {
        return a * b;
    }

    public static int Div(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Division by zero!");
            return 0;
        }
        return a / b;
    }

    public static int Percentage(int a, int b) {
        return (a * b) / 100;
    }
}
