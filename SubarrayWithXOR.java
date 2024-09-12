import java.util.HashMap;

public class SubarrayWithXOR{
    public static void main (String[] args){
        int [] arr = {4,2,2,6,4};
        int xor = 6;
        System.out.println(subArrayXOR(arr,xor));
    }
    public static int subArrayXOR(int[] arr, int xor){
        HashMap<Integer,Integer> hmap = new HashMap<>();
        int count = 0;
        hmap.put(0,1);
        int prefixXOR = 0;
        for(int i=0;i<arr.length;i++){
            prefixXOR=prefixXOR^arr[i];
            if(hmap.containsKey(prefixXOR ^ xor)){
                count += hmap.get(prefixXOR ^ xor);
            }
            hmap.put(prefixXOR,hmap.getOrDefault(prefixXOR,0)+1);
        }
        return count;
    
    }
}