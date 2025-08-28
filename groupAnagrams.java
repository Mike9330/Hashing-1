// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<Double, List<String>> answer = new HashMap<>();
        for (String str: strs) {
            double hash = getHash(str);

            if (!answer.containsKey(hash)) {
                answer.put(hash, new ArrayList<>());
            }

            answer.get(hash).add(str);
        }

        return new ArrayList<>(answer.values());
    }

    private double getHash(String str) {
        int[] primes = {
                2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37,
                41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101
        };
        double hash = 1;

        for (char c : str.toCharArray()) {
            hash *= primes[c - 'a'];
        }
        return hash;
    }
}