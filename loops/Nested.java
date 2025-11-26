package loops;

import java.util.Scanner;

public class Nested {

  public static void main(String[] args) {
    for (int row = 0; row < 3; row++) {
      for (int col = 0; col < 3; col++) {
        System.out.print("* ");
      }
      System.out.println();
    }

    // Task 1
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter cols: ");
    int cols = scanner.nextInt();

    System.out.print("Enter rows: ");
    int rows = scanner.nextInt();

    for (int row = 0; row < rows; row++) {
      for (int col = 0; col < cols; col++) {
        System.out.print("* ");
      }

      System.out.println();
    }

    scanner.close();
  }
}
