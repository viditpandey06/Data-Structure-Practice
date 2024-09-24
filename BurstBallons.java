// import java.util.ArrayList;
// import java.util.List;

// class Solution {
//     public int maxCoins(int[] nums) {
//         List<Integer> arrList = new ArrayList<>();
       
//         arrList.add(1);
//         for (int num : nums) {
//             arrList.add(num);
//         }
//         arrList.add(1);
        
//         return helper(arrList);
//     }

//     public int helper(List<Integer> arrList) {
//         if (arrList.size() == 3) { 
//             return arrList.get(0) * arrList.get(1) * arrList.get(2);
//         }

//         int maxCoins = 0;
       
//         for (int i = 1; i < arrList.size() - 1; i++) {
           
//             int coins = arrList.get(i - 1) * arrList.get(i) * arrList.get(i + 1);
//             int burstBalloon = arrList.remove(i); 
            
           
//             coins += helper(arrList);
//             maxCoins = Math.max(maxCoins, coins); 
            
//             arrList.add(i, burstBalloon); //add at indx and then backtrack.
//         }
//         return maxCoins;
//     }
// }


import java.util.Arrays;

class Solution {
    public int maxCoins(int[] nums) {
        int n = nums.length;
        int[] newNums = new int[n + 2];
        newNums[0] = 1;
        newNums[n + 1] = 1;
        for (int i = 1; i <= n; i++) {
            newNums[i] = nums[i - 1];
        }

        int[][] memo = new int[n + 2][n + 2];
        for (int[] row : memo) {
            Arrays.fill(row, -1);
        }

        return maxCoinsRecursive(newNums, 1, n, memo);
    }

    private int maxCoinsRecursive(int[] nums, int left, int right, int[][] memo) {
        if (left > right) {
            return 0;
        }

        if (memo[left][right] != -1) {
            return memo[left][right];
        }

        int maxCoins = 0;

        for (int i = left; i <= right; i++) {
            int coins = nums[left - 1] * nums[i] * nums[right + 1];
            coins += maxCoinsRecursive(nums, left, i - 1, memo) + maxCoinsRecursive(nums, i + 1, right, memo);
            maxCoins = Math.max(maxCoins, coins);
        }

        memo[left][right] = maxCoins;
        return maxCoins;
    }
}




