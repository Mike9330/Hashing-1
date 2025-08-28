// Time Complexity : O(n)
// Space Complexity : O(1) <-- Max value of maps is 26
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None
class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> sMap = new HashMap<>();
        HashMap<Character, Character> tMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if (sMap.containsKey(sChar)) {
                if (sMap.get(sChar) != tChar){
                    return false;
                }
            } else {
                sMap.put(sChar, tChar);
            }

            if (tMap.containsKey(tChar)) {
                if (tMap.get(tChar) != sChar){
                    return false;
                }
            } else {
                tMap.put(tChar, sChar);
            }
        }
        return true;
    }
}
