class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder ar = new StringBuilder();
        s = s.toLowerCase();
        for (char i : s.toCharArray()) {
            if (((int) i < 123 && (int) i > 96) || (int) i < 58 && (int) i > 47) {
                ar.append(i);
            }
        }
        String a = ar.toString();
        int left = 0;
        int right = a.length() - 1;
        while (left < right) {
            if (a.charAt(left) != a.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
