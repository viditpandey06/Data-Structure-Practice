public class NiceSubarrays {
    public static void main(String[] args) {
        int [] nums = {2,2,2,1,2,2,1,2,2,2};
        int k =2;
        System.out.println(numberOfSubarrays(nums, k));
    }
    public static int numberOfSubarrays(int[] nums, int k) {
        int l=0,r=0,oddCount=0,maxLen=0,ctr=0;
        while(r<nums.length){
            if(nums[r]%2!=0){
                oddCount++;
            }
            while(oddCount>k){
                if(nums[l]%2!=0){
                    oddCount--;
                }
                l++;
            }
            if(oddCount==k){
                ctr++;
                maxLen=Math.max(maxLen,r-l+1);
            }
            r++;
        }
        return ctr;
    }
}
