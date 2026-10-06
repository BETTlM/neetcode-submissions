class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i : arr) {
            if (hashMap.containsKey(i)) {
                hashMap.put(i, hashMap.get(i) + 1);
            }
            else {
                hashMap.put(i, 1);
            }
        }
        int special = -1;
        for (int i : hashMap.keySet()) {
            System.out.println(i + " " + hashMap.get(i));
            if (i == hashMap.get(i)) {
                if (i > special) {
                    special = i;
                }
            }
        }
        return special;
    }
}