import java.util.HashSet;
public class SubarraySumDivbyK {
  public static void main(String[] args) {
    SubarraySumDivbyK obj = new SubarraySumDivbyK();
    int[] nums = {9,9};
    System.out.println(obj.subarraySum(nums, 9));
  }

  public int subarraySum2(int[] nums, int k) {
    int ctr=0;
    for(int i=0;i<nums.length;i++){
    int sum=0;
    for(int j=i;j<nums.length;j++){
        sum+=nums[j];
        if(sum%k==0){
            ctr++;
    }
    }
}
  return ctr;
  }
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
  
  }
