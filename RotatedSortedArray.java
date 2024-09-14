public class RotatedSortedArray {
     public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        System.out.println(search(arr, target));
     }
     public static int search(int[] nums, int target) {
        int low =0;
        int high =nums.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid]==target){
                return mid;
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
