class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> unique = new HashSet<>();
        for (String s : emails) {
            StringBuilder sb = new StringBuilder("");
            int i = 0;
            while (i < s.length() && s.charAt(i) != '@' && s.charAt(i) != '+') {
                if (s.charAt(i) != '.') {
                    sb.append(s.charAt(i));
                }
                i++;
            }
            while (i < s.length() && s.charAt(i) != '@') {
                i++;
            }
            String dom = s.substring(i);
            sb.append(dom);
            unique.add(sb.toString());
        }
        return unique.size();
    }
}