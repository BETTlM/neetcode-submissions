class Solution {
    public int maxDifference(String s) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;
        for (int i : freq) {
            if (i == 0) {
                continue;
            }
            if (i % 2 == 0) {
                minimum = Math.min(minimum, i);
            }
            else {
                maximum = Math.max(maximum, i);
            }
        }
        return maximum - minimum;
    }
}