class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(new ArrayList<>(),1,n,k,ans);
        return ans;
    }
    private void helper(List<Integer> temp, int indx, int target, int k, List<List<Integer>>ans){
        if(target==0){
            if(temp.size()==k)
            ans.add(new ArrayList<>(temp));
        }
        if(target<0||indx>9){
            return;
        }
        if(indx<=target){
            temp.add(indx);
            helper(temp,indx+1,target-indx,k,ans);
            temp.removeLast();
            helper(temp,indx+1,target,k,ans);
             
        }
    }
}