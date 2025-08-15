package LongestNonRepeatingSubString;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {
  public int longestSubString(String s){
    Map<Character, Integer> map = new HashMap<>();
    int longestString = 0;
    int left = 0;
    int right = 0;

    while(right < s.length()) {
      char rightChar = s.charAt(right);
      map.put(rightChar, map.getOrDefault(rightChar, 0) + 1);
      right++;

      while(map.get(rightChar) > 1) {
        char leftChar = s.charAt(left);
        map.put(leftChar, map.get(leftChar) - 1);
        left++;
      }

      longestString = Math.max(longestString, right - left + 1);
    }
    return longestString;
  }
}
