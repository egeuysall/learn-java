package introduction;

import java.util.Scanner;

public class FormattedOutput {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter your name: ");
    String name = scanner.nextLine();

    System.out.print("Enter your age: ");
    int age = scanner.nextInt();

    System.out.print("Enter the price: $");
    double price = scanner.nextDouble();

    System.out.printf("Hello %s, you're %d years old. Also, the item you want to buy costs $%.2f.%n", name, age, price);

    scanner.close();
  }
}
