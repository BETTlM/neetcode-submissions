class Solution {
    public int[] replaceElements(int[] arr) {
        if (arr.length == 1) {
            return new int[]{-1};
        }
        int len = arr.length - 1;
        int max = arr[len];
        arr[len] = -1;
        for (int i = len - 1; i >= 0;i--) {
            int val = arr[i];
            arr[i] = max;
            max = Math.max(val, max);
        }
        return arr;
    }
}