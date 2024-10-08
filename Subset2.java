class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
       Arrays.sort(nums);
       List<List<Integer>> aList = new ArrayList<>();
       List<Integer> temp = new ArrayList<>();
       generator(aList,nums,0,temp); 
       return aList;
    }
    public void generator (List<List<Integer>> aList, int [] nums, int indx, List<Integer> temp){
        if(nums.length==indx){
            Collections.sort(temp);   
            if(!aList.contains(temp))
            aList.add(new ArrayList<>(temp));
            return ;
        }
        else{
        temp.add(nums[indx]);
        
        generator(aList,nums,indx+1,temp);
        temp.removeLast();
         generator(aList,nums,indx+1,temp);
        }
    }
}