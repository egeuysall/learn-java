package introduction;

import java.util.Scanner;

public class Casting {

  public static void main(String[] args) {
    int num = 10;
    double result = num;

    System.out.println(result);

    double price = 19.99;
    int dollars = (int) price;

    System.out.println(dollars);

    System.out.println(Integer.parseInt("123"));
    System.out.println(String.valueOf(15));

    // Task 1: Casting
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a decimal number: ");
    double decimal = scanner.nextDouble();

    int decimalInt = (int) decimal;
    
    System.out.println("Original value: " + decimal);
    System.out.println("Changed value: " + decimalInt);

    scanner.close();
  }
}
