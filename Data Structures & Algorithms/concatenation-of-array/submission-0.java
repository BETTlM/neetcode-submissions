class Solution {
    public int[] getConcatenation(int[] nums) {
        int l = nums.length;
        int[] newa = new int[2 * l];
        for (int i = 0; i < l; i++) {
            newa[i] = nums[i];
            newa[l + i] = nums[i];
        }
        return newa;
    }
}