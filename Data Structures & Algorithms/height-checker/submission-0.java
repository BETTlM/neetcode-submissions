class Solution {
    public int heightChecker(int[] heights) {
        int[] og = heights.clone();
        Arrays.sort(heights);
        int counter = 0;
        for (int i = 0; i < og.length; i++) {
            if (og[i] != heights[i]) {
                counter++;
            }
        }
        return counter;
    }
}