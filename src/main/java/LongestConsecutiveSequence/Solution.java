package LongestConsecutiveSequence;

import java.util.HashSet;
import java.util.Set;

public class Solution {
  public int longestConsecutive(int[] nums) {
    int longestStreak = 0;

    if(nums.length == 0) {
      return 0;
    }

    // Create a Hash for quick lookups and populate it
    Set<Integer> numSet = new HashSet<>();
    for(int num : nums) {
      numSet.add(num);
    }

    for (int num : numSet) {

      // Here we dont start counting until we find the lowest value!
      if(!numSet.contains(num - 1)) {
        int currentNum = num;
        int currentStreak = 1;

        // Now we start counting
        while(numSet.contains(currentNum + 1)) {
          currentNum++;
          currentStreak++;
        }

        longestStreak = Math.max(longestStreak, currentStreak);
      }
    }
    return longestStreak;
  }

  public boolean arrayContains(int[] array, int number) {
    for(int i = 0; i < array.length; i++){
      if(array[i] == number){
        return true;
      }
    }
    return false;
  }
}
