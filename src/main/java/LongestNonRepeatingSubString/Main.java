package LongestNonRepeatingSubString;

public class Main {
  public static void main(String[] args) {
    var solution = new Solution();
    String testCase1 = "abcabcbb";
    String testCase2 = "bbbbb";
    String testCase3 = "pwwkew";

    System.out.println(solution.longestSubString(testCase1));
    System.out.println(solution.longestSubString(testCase2));
    System.out.println(solution.longestSubString(testCase3));
  }
}
