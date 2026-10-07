class Solution {
    public boolean isMonotonic(int[] nums) {
        int increasingPair = 0;
        int decreasingPair = 0;
        if (nums.length == 0) {
            return true;
        }
        for (int i = 0; i < nums.length - 1; i++) { 
            if (nums[i] > nums[i + 1]) {
                decreasingPair++;
            }
            else if (nums[i] < nums[i + 1]) {
                increasingPair++;
            }
        }
        return (increasingPair == 0) || (decreasingPair == 0);
    }
}