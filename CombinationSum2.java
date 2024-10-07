class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates); // Sorting is important to handle duplicates
        helper(candidates, target, 0, ans, new ArrayList<>());
        return ans;
    }
    
    private void helper(int[] candidates, int target, int index, List<List<Integer>> ans, List<Integer> temp) {
        // Base case: if target is 0, add the current combination to the answer
        if (target == 0) {
            ans.add(new ArrayList<>(temp));
            return;
        }
        // If index goes out of bounds or target becomes negative, return
        if (index == candidates.length || target < 0) {
            return;
        }
        
        // Loop through candidates starting from the current index
        for (int i = index; i < candidates.length; i++) {
            // Skip duplicates to avoid repeated combinations
            if (i > index && candidates[i] == candidates[i - 1]) continue;
            
            if (candidates[i] <= target) {
                temp.add(candidates[i]);
                helper(candidates, target - candidates[i], i + 1, ans, temp);
                temp.removeLast(); 
            }
        }
    }
}
