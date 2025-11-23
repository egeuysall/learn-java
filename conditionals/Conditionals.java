package conditionals;

import java.util.Scanner;

public class Conditionals {

  public static void main(String[] args) {
    // Task 1
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int number = scanner.nextInt();

    if (number > 0) {
      System.out.println("The number is positive");
    } else if (number < 0) {
      System.out.println("The number is negative");
    } else {
      System.out.println("The number is zero");
    }

    // Task 2
    System.out.print("Enter your age: ");
    int age = scanner.nextInt();

    if (age >= 13 && age <= 19) {
      System.out.println("You are a teenager");
    } else if (age >= 20 && age <= 29) {
      System.out.println("You are an adult");
    } else {
      System.out.println("You are a child");
    }

    // Task 3
    scanner.nextLine();
    System.out.print("Enter your name: ");
    String name = scanner.nextLine();

    if (name.length() > 10) {
      System.out.println("Your name is too long");
    } else if (name.length() < 10) {
      System.out.println("Your name is too short");
    } else {
      System.out.println("Your name is correct");
    }

    scanner.close();
  }
}
