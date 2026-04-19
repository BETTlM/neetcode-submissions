class Solution {
    public List<List<Integer>> generate(int numRows) {
        ArrayList<List<Integer>> result = new ArrayList<>();
        ArrayList<Integer> row1 = new ArrayList<>();
        row1.add(1);
        ArrayList<Integer> row2 = new ArrayList<>();
        row2.add(1);
        row2.add(1);
        result.add(row1);
        if (numRows == 1) {
            return result;
        }
        result.add(row2);
        if (numRows == 2) {
            return result;
        }
        for (int i = 0; i < numRows - 2; i++) {
            ArrayList<Integer> val = new ArrayList<>();
            val.add(1);
            List<Integer> prev = result.get(result.size() - 1);
            int len = prev.size();
            for (int j = 0; j < len - 1; j++) {
                val.add(prev.get(j) + prev.get(j+1));
            }
            val.add(1);
            result.add(val);
        }
        return result;
    }
}