
class Solution extendds {
    public int minCostClimbingStairs(int[] cost) {
        return Math.min(helper(cost, 0), helper(cost, 1));
    }

    private int helper(int[] cost, int i) {
        if (i >= cost.length) {
            return 0;
        }

        int oneStep = cost[i] + helper(cost, i + 1);
        int twoSteps = (i + 1 < cost.length ? cost[i + 1] + helper(cost, i + 2) : 0);

        return Math.min(oneStep, twoSteps);
    }
}
