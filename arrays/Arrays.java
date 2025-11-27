package arrays;

import java.util.Scanner;

public class Arrays {

  public static int add(int[] nums) {
    int count = 0;

    for (int i = 0; i < nums.length; i++) {
      count += nums[i];
    }

    return count;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("How many numbers: ");
    int num = scanner.nextInt();
    scanner.nextLine();

    int[] nums = new int[num];

    for (int i = 0; i < nums.length; i++) {
      System.out.printf("Enter number %d: ", i + 1);
      int userNum = scanner.nextInt();
      nums[i] = userNum;
    }

    scanner.close();

    int result = add(nums);

    System.out.println(result);
  }
}
