public class RotatedSortedArrayII{
    public static void main(String[] args) {
       int[] arr = {1,0,1,1,1};
       int target = 0;
       if (search(arr, target) != -1) {
           System.out.println("Element found");
       } else {
           System.out.println("Element not found");
        
       }

    }
    public static int search(int[] nums, int target) {
       int low =0;
       int high =nums.length-1;
       while(low<=high){
           int mid = (low+high)/2;
           if(nums[mid]==target){
               return mid;
           }
           else if(nums[low]==nums[high]&&nums[low]==nums[mid])//[1,0,1,1,1]
           {
               low=low+1;
               high=high-1;
           }
           else if(nums[low]<=nums[mid]){//left sorted
               if(nums[low]<=target&&nums[mid]>target){
                   high=mid-1;
               }
               else{
                   low=mid+1;
               }
           }
           else{ //right sorted
               if(nums[high]>=target&&nums[mid]<target){
                   low=mid+1;
               }
               else{
                   high=mid-1;
               }

           }  
       }
       return -1; 
   }
}
