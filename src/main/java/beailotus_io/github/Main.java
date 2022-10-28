package beailotus_io.github;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first number: ");
        double firstNumber = scanner.nextDouble();

        System.out.print("Enter your second number: ");
        double secondNumber = scanner.nextDouble();

        System.out.print("Enter your operator: ");
        char operator = scanner.next().charAt(0);

        double result = 0;

        switch (operator) {
            case '+' -> result = firstNumber + secondNumber;
            case '-' -> result = firstNumber - secondNumber;
            case '*' -> result = firstNumber * secondNumber;
            case '/' -> result = firstNumber / secondNumber;
            case '^' -> result = Math.pow(firstNumber, secondNumber);
            case '%' -> result = firstNumber % secondNumber;
            default -> System.out.println("Unsupported operator");
        }

        System.out.println("Result: " + result);
    }
}