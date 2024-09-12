import java.util.*;
public class SubArraySum{
    public static void main(String[] args){
        int [] arr ={1,2,3,4,5,6,7,8,9,10};
        int sum = 15;
        System.out.println(subArraySum(arr,sum));
     }
     public static int subArraySum(int[] arr, int Sum){
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        map.put(0,1);
        int prefixSum = 0;
        for(int i=0;i<arr.length;i++){
            prefixSum += arr[i];
           if(map.containsKey(prefixSum-Sum)){
                count += map.get(prefixSum-Sum);
           }
              map.put(prefixSum, map.getOrDefault(prefixSum,0)+1);
        } 
        return count;
        
        }
}