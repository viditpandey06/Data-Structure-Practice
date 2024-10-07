class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(candidates, target, 0, ans, new ArrayList<>());
        return ans;
    }
    
    private void helper(int[] candidates, int target, int index, List<List<Integer>> ans, List<Integer> temp) {
        // Base case: if target is 0, add the current combination to the answer
        if (target == 0) {
            ans.add(new ArrayList<>(temp));
            return;
        }
        // If target becomes negative or index is out of bounds, stop
        if (target < 0 || index == candidates.length) {
            return;
        }
        
        // Case 1: Include the current candidate and call helper with the same index
        if (candidates[index] <= target) {
            temp.add(candidates[index]);
            helper(candidates, target - candidates[index], index, ans, temp);
            
            temp.remove(temp.size() - 1); // Backtrack
        }
        
        // Case 2: Exclude the current candidate and move to the next one
          helper(candidates, target, index + 1, ans, temp);
    }
}
