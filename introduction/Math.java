package introduction;

import java.util.Scanner;

public class Math {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter num1: ");
    double num1 = scanner.nextDouble();

    System.out.print("Enter num2: ");
    double num2 = scanner.nextDouble();

    scanner.close();

    System.out.println("Addition: " + (num1 + num2));
    System.out.println("Subtraction: " + (num1 - num2));
    System.out.println("Multiplication: " + (num1 * num2));
    System.out.println("Division: " + (num1 / num2));
    System.out.println("Remainder: " + (num1 % num2));
  }
}
