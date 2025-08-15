package TwoSum;

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    int[] testCase1 = {2, 7, 11, 15};
    int[] testCase2 = {3, 2, 4};
    int[] testCase3 = {3, 3};
    var solution = new Solution();
    System.out.println(Arrays.toString(solution.twoSum(testCase1, 9)));
    System.out.println(Arrays.toString(solution.twoSum(testCase2, 6)));
    System.out.println(Arrays.toString(solution.twoSum(testCase3, 6)));
  }
}
