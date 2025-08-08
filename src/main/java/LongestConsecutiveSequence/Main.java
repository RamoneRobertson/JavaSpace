package LongestConsecutiveSequence;

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {

    int[] numbers = {100,4,200,1,3,2};
    int[] moreNumbers = {0,3,7,2,5,8,4,6,0,1};
    int[] evenMoreNumbers = {1,0,1,2};

    System.out.println(printSequence(numbers));
    System.out.println(printSequence(moreNumbers));
    System.out.println(printSequence(evenMoreNumbers));
  }

  public static String printSequence(int[] array){
    var solution = new Solution();
    return "Longest Consecutive Sequence: " + solution.longestConsecutive(array) + "\n" + Arrays.toString(array);
  }
}
