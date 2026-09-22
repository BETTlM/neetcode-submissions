class Solution {
    public int maxArea(int[] heights) {
        int pointer1 = 0;
        int len = heights.length;
        int pointer2 = len - 1;
        int maxWater = 0;
        if (len <= 1) {
            return maxWater;
        }
        while (pointer2 > pointer1) {
            int waterLevel = (pointer2 - pointer1) * Math.min(heights[pointer1], heights[pointer2]);
            maxWater = Math.max(maxWater, waterLevel);
            if (heights[pointer2] > heights[pointer1]) {
                pointer1++;
            }
            else{
                pointer2--;
            }
        }
        return maxWater;
    }
}
