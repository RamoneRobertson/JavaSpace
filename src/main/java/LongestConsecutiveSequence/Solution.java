package LongestConsecutiveSequence;

import java.util.HashSet;
import java.util.Set;

public class Solution {
  public int longestConsecutive(int[] nums) {
    int longestSequence = 0;

    Set<Integer> numSet = new HashSet<>();
    for(int num : nums) {
      numSet.add(num);
    }

    for(int num : nums) {
      if(!numSet.contains(num-1)) {
        int currentNum = num;
        int currentSequence = 1;

        while(numSet.contains(currentNum + 1)) {
          currentSequence++;
          currentNum++;
        }
        longestSequence = Math.max(longestSequence, currentSequence);
      }
    }
    return longestSequence;
  }
}
