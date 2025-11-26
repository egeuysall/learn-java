package loops;

import java.util.Scanner;

public class Loops {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int number = scanner.nextInt();
    scanner.close();

    for (int i = 0; i <= number; i++) {
      System.out.println(i);
    }
    
    System.out.println("First loop completed!");

    while (number > 0) {
      System.out.println(number);
      number--;
    }
  }
}
