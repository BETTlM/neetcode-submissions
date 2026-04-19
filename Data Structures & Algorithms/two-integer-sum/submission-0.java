class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int index;
        for (index = 0; index < nums.length; index++) {
            if (hm.containsKey(target - nums[index])) {
                return new int[]{hm.get(target - nums[index]), index};
            }
            else {
                hm.put(nums[index], index);
            }
        }
        return null;
    }
}
