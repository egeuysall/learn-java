package project;

import java.util.Scanner;

public class Workouts {

  static String[] exercises = { "Bench Press", "Squat", "Deadlift", "OHP", "Barbell Row", "Pull-ups", "Dips" };
  static String[] months = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
  static int[][] prs = new int[7][12];
  static int currentMonth = 0;

  public static void addPR(Scanner scanner) {
    for (int i = 0; i < exercises.length; i++) {
      System.out.printf("%d. %s%n", i + 1, exercises[i]);
    }

    System.out.print("Select exercise: ");
    int exerciseChoice = scanner.nextInt();

    System.out.printf("Enter PR weight for %s: ", exercises[exerciseChoice - 1]);
    int weight = scanner.nextInt();

    prs[exerciseChoice][currentMonth] = weight;
    System.out.printf("PR updated for %s!\n", exercises[exerciseChoice - 1]);
  }

  public static void viewMatrix() {
    System.out.printf("%-15s", "Exercise");

    for (int i = 0; i < months.length; i++) {
      System.out.printf("%5s", months[i]);
    }
    System.out.println();

    for (int i = 0; i < 80; i++) {
      System.out.print("-");
    }
    System.out.println();

    for (int row = 0; row < exercises.length; row++) {
      System.out.printf("%-15s", exercises[row]);

      for (int col = 0; col < months.length; col++) {
        if (prs[row][col] == 0) {
          System.out.printf("%5s", "---");
        } else {
          System.out.printf("%5d", prs[row][col]);
        }
      }

      System.out.println();
    }
  }

  public static void monthlyProgress() {
    if (currentMonth == 0) {
      System.out.println("No previous month to compare");
    } else {
      System.out.println("--- MONTHLY PROGRESS (comparing to last month) ---");

      for (int i = 0; i < exercises.length; i++) {
        int thisMonth = prs[i][currentMonth];
        int lastMonth = prs[i][currentMonth - 1];

        int diff = thisMonth - lastMonth;

        if (diff > 0) {
          System.out.printf("%s: %d increased by %d lbs%n", exercises[i], lastMonth, diff);
        } else if (diff < 0) {
          System.out.printf("%s: %d decreased by %d lbs%n", exercises[i], lastMonth, diff);
        } else {
          System.out.printf("%s: %d did not change%n", exercises[i], lastMonth);
        }
      }
    }
  }

  public static void bestGains() {
    int bestGain = 0;
    int bestExercise = -1;

    for (int i = 0; i < exercises.length; i++) {
      int startWeight = -1;
      for (int j = 0; j <= currentMonth; j++) {
        if (prs[i][j] != 0) {
          startWeight = prs[i][j];
          break;
        }
      }

      if (startWeight == -1 || prs[i][currentMonth] == 0) {
        continue;
      }

      int currentWeight = prs[i][currentMonth];

      int gain = currentWeight - startWeight;

      if (gain > bestGain) {
        bestGain = gain;
        bestExercise = i;
      }
    }

    if (bestExercise == -1) {
      System.out.println("No PR data yet");
    } else {
      System.out.printf("Best gains: %s improved by %d lbs%n", exercises[bestExercise], bestGain);
    }
  }

  public static void detectStalls() {
    if (currentMonth < 2) {
      System.out.println("Need at least 3 months of data");
      return;
    }

    System.out.println("--- STALL DETECTION ---");

    boolean foundStall = false;

    for (int i = 0; i < exercises.length; i++) {
      int month1 = prs[i][currentMonth - 2];
      int month2 = prs[i][currentMonth - 1];
      int month3 = prs[i][currentMonth];

      if (month1 == month2 && month2 == month3 && month1 != 0) {
        System.out.printf("%s: STALLED - no progress in 3 months%n", exercises[i]);
        foundStall = true;
      }
    }

    if (!foundStall) {
      System.out.println("No stalls detected - keep grinding!");
    }
  }

  public static void printMenu() {
    System.out.println("\n--- EXERCISE PR TRACKER ---");
    System.out.println("1. Add/Update PR");
    System.out.println("2. View PR Matrix");
    System.out.println("3. Monthly Progress Report");
    System.out.println("4. Best Gains Analysis");
    System.out.println("5. Stall Detection");
    System.out.println("6. New Month");
    System.out.println("7. Exit");
    System.out.print("Choice: ");
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    printMenu();
    int decision = scanner.nextInt();

    while (decision != 7) {
      if (decision == 1) {
        addPR(scanner);
      } else if (decision == 2) {
        viewMatrix();
      } else if (decision == 3) {
        monthlyProgress();
      } else if (decision == 4) {
        bestGains();
      } else if (decision == 5) {
        detectStalls();
      } else if (decision == 6) {
        currentMonth++;

        if (currentMonth > 11) {
          currentMonth = 0;
        }
      } else {
        System.out.println("Invalid choice!");
      }

      printMenu();
      decision = scanner.nextInt();
    }

    System.out.println("Goodbye!");
    scanner.close();
  }
}
