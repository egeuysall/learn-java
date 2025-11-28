package problems;

import java.util.Scanner;

public class Nums {

  public static boolean isPrime(int num) {
    if (num < 2) {
      return false;
    }

    for (int i = 2; i < num; i++) {
      if (num % i == 0) {
        return false;
      }
    }

    return true;
  }

  public static int findMax(int[] nums) {
    int max = nums[0];

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] > max) {
        max = nums[i];
      }
    }

    return max;
  }

  public static void main(String[] args) {
    // Problem 1
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int num = scanner.nextInt();
    int sum = 0;

    for (int i = 0; i <= num; i++) {
      if (i % 2 == 0) {
        System.out.println(i);
        sum += i;
      }
    }

    System.out.printf("The sum is %d.%n", sum);

    // Problem 2
    System.out.print("Enter another number: ");
    int num2 = scanner.nextInt();

    boolean result = isPrime(num2);

    if (result) {
      System.out.println("The number is prime.");
    } else {
      System.out.println("The number is not prime.");
    }

    // Problem 3
    System.out.print("How many numbers: ");
    int numCount = scanner.nextInt();

    int[] nums = new int[numCount];

    for (int i = 0; i < numCount; i++) {
      System.out.printf("Enter number %d: ", i + 1);
      int userNum = scanner.nextInt();

      nums[i] = userNum;
    }

    int maxNum = findMax(nums);
    System.out.printf("The maximum number is %d.%n", maxNum);

    scanner.close();
  }
}
