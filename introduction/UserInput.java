package introduction;

import java.util.Scanner;

public class UserInput {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter your name: ");
    String name = scanner.nextLine();

    System.out.print("Enter your age: ");
    int age = scanner.nextInt();

    System.out.print("Enter your GPA: ");
    double gpa = scanner.nextDouble();

    System.out.println("Hey, my name is " + name + " and I am " + age + " years old. Also, I have a GPA of " + gpa + ".");

    scanner.close();
  }
}
