class Solution {
    private static final int MOD = 1000000007;
    
    public int countGoodNumbers(long n) {
        return (int) helper(1, n, false);
    }
    
    private long helper(long ans, long n, boolean flag) {
        if (n == 1) {
            return 5;
        } else {
            if (!flag) {
                ans = (ans * 5) % MOD;
                n--;
                return helper(ans, n, true); // Use return to propagate result
            } else {
                ans = (ans * 4) % MOD;
                n--;
                return helper(ans, n, false); // Use return to propagate result
            }
        }
    }
}
