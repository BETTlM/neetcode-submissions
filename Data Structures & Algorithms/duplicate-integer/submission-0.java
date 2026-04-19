class Solution {
    public boolean hasDuplicate(int[] nums) {
       HashSet<Integer> seta = new HashSet<>();
       for (int i : nums) {
            if (seta.contains(i)) {
                return true;
            }
            else {
                seta.add(i);
            }
       }
       return false;
    }
}