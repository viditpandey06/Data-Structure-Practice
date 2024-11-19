import java.util.HashMap; 
class Solution {
    public int numSubarraysWithSum(int[] arr, int target) {
       int sum=0;
         int count = 0;
         HashMap<Integer,Integer> map = new HashMap<>();
         map.put(0,1);
         for(int i=0;i<arr.length;i++) {
             sum+=arr[i];
             if(map.containsKey(sum-target)) {
                 count+=map.get(sum-target);
             }
             map.put(sum,map.getOrDefault(sum,0)+1);
         }
         return count;
    }
}