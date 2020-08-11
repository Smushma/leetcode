class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        if (k == 0 || n == 0) 
            return new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        backtracking(1, k, n, result, new ArrayList<>());
        return result;
    }
    
    private void backtracking(int start, int k, int n, List<List<Integer>> ans, List<Integer> combo) {
        if (combo.size() > k)
            return;
        if (combo.size() == k && n == 0) {
            List<Integer> temp = new ArrayList<>(combo);
            ans.add(temp);
            return;
        }
        for (int i = start; i <= n && i <= 9; i++) {
            combo.add(i);
            backtracking(i+1, k, n-i, ans, combo);
            combo.remove(combo.size() - 1);
        }
    }
}