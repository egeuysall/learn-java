package arrays;

public class Grid {

  public static void main(String[] args) {
    // Declare empty array
    int[][] grid = new int[3][3];

    // Declare filled array
    int[][] grid2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

    // Set values
    grid2[0][0] = 0;

    for (int i = 0; i < grid2.length; i++) {
      for (int j = 0; j < grid2[i].length; j++) {
        System.out.print(grid2[i][j] + " ");
      }
      System.out.println();
    }

    // Print array
    System.out.println(grid + "\n");

    // TASK 1: 3x3 grid filled with numbers
    int[][] nums = new int[3][3];
    int counter = 0;

    for (int row = 0; row < nums.length; row++) {
      for (int col = 0; col < nums[row].length; col++) {
        counter++;
        nums[row][col] = counter;

        System.out.print(nums[row][col] + " ");
      }
      System.out.println();
    }

    // TASK 2: Practice 2d arrays

    // TASK 3: Build a feature and a matrix
  }
}
