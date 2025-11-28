package arrays;

public class Dimensions {

  public static void exerciseB() {
    int[][] grid = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

    for (int row = 0; row < grid.length; row++) {
      int max = grid[row][0];

      for (int col = 0; col < grid[row].length; col++) {
        if (grid[row][col] > max) {
          max = grid[row][col];
        }
      }

      System.out.println("Row " + row + " max: " + max);
    }
  }

  public static void exerciseC() {
    int[][] nums = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
    int sum = 0;

    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums[i].length; j++) {
        sum += nums[i][j];
      }

      System.out.printf("Row %d sum: %d%n", i + 1, sum);
      sum = 0;
    }
  }

  public static void exerciseD() {
    int nums[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
    int sum = 0;

    for (int i = 0; i < nums[0].length; i++) {
      for (int j = 0; j < nums.length; j++) {
        sum += nums[j][i];
      }

      System.out.printf("Col %d sum: %d%n", i + 1, sum);
      sum = 0;
    }
  }

  public static void main(String[] args) {
    int[][] array = new int[3][4];
    int sum = 0;

    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        array[i][j] = i * j;
        sum += array[i][j];

        System.out.print(array[i][j] + " ");
      }
      System.out.println();
    }
    System.out.printf("Sum: %d%n", sum);

    exerciseC();

    for (var i = 0; i < 24; i++) {
      System.out.print("-");
    }
    System.out.println();

    exerciseD();
  }
}
