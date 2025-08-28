// Time Complexity : O(n)
// Space Complexity : O(1) <-- Max value of both maps is 26
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : At first used single map approach, not realizing mapping should go both ways

import java.util.*;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (words.length != pattern.length()){
            return false;
        }

        Map<Character, String> charMap = new HashMap<>();
        Map<String, Character> wordMap = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String w = words[i];

            if (charMap.containsKey(c) && !charMap.get(c).equals(w)) {
                return false;
            }
            if (wordMap.containsKey(w) && wordMap.get(w) != c) {
                return false;
            }

            charMap.put(c, w);
            wordMap.put(w, c);
        }
        return true;
    }
}
