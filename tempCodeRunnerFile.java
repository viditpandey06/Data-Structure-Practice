public int subarraySum(int[] nums, int k) {
    int sum=0;
    int ctr=0;
    HashSet<Integer> set = new HashSet<>();
    set.add(0);
    for(int i=0;i<nums.length;i++){
        sum+=nums[i];
        int rem = sum%k;
        if(rem%k==0){
            ctr++;
        }
        else{
            if(set.contains(rem)){
                ctr++;
            }
            else if (set.contains(rem - k)) {
            ctr++;
          }

            else{
                set.add(rem);
            }
        }
        
    }
    return ctr;
}