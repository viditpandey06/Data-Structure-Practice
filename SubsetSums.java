
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int N = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                arr.add(sc.nextInt());
            }
            Solution ob = new Solution();

            ArrayList<Integer> ans = ob.subsetSums(arr, N);
            Collections.sort(ans);
            for (int sum : ans) {
                System.out.print(sum + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


// User function Template for Java//User function Template for Java
class Solution {
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        helper(arr,0,0,ans);
        return ans;
    }
    private void helper(ArrayList<Integer> arr, int indx, int sum , ArrayList<Integer> ans){
        if(indx==arr.size()){
            ans.add(sum);
            return ;
        }
        else{
            helper(arr,indx+1,sum,ans);
            helper(arr,indx+1,sum+arr.get(indx),ans);
            
        }
    }
  
}