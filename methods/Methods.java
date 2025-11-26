package methods;

import java.util.Scanner;

// The syntax for methods is:
// public static returnType methodName(parameterType parameterName) {
//     // Code
//     return value;
// }

public class Methods {

  public static int add(int a, int b) {
    return a + b;
  }

  public static int multiply(int a, int b) {
    return a * b;
  }

  public static String greet(String name) {
    return "Hello " + name + "!";
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int result = add(1, 2);
    System.out.println(result);

    // Task 1
    System.out.print("Enter first number: ");
    int num1 = scanner.nextInt();

    System.out.print("Enter second number: ");
    int num2 = scanner.nextInt();
    scanner.nextLine();

    int multiplyResult = multiply(num1, num2);
    System.out.printf("The product of %d and %d is %d.%n", num1, num2, multiplyResult);

    // Task 2
    System.out.print("Enter your name: ");
    String name = scanner.nextLine();

    scanner.close();
    String greeting = greet(name);

    System.out.println(greeting);
  }
}
