class Solution {
    public List<List<Integer>> subsets(int[] nums) {
       List<List<Integer>> aList = new ArrayList<>();
       List<Integer> temp = new ArrayList<>();
       generator(aList,nums,0,temp); 
       return aList;
    }
    public void generator (List<List<Integer>> aList, int [] nums, int indx, List<Integer> temp){
        if(nums.length==indx){
            aList.add(new ArrayList<>(temp));
            System.out.println(temp);
            return ;
        }
        else{
        temp.add(nums[indx]);
        
        generator(aList,nums,indx+1,temp);
        temp.remove(temp.size() - 1);
        
         generator(aList,nums,indx+1,temp);
         
        }
    }
}