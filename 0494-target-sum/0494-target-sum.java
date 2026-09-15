class Solution {
    public static int sum;

    public int findTargetSumWays(int[] nums, int target) {
        sum = 0;
        int n = nums.length;

        for (int ele : nums) {
            sum += ele;
        }
        int[][] dp = new int[n][2 * sum + 1];
        for (int[] d : dp) {
            Arrays.fill(d, -1);
        }
        return ways(0, nums, target, dp);

    }

    private int ways(int i, int[] arr, int target, int[][] dp) {
        if (target < -sum || target > sum) {
            return 0;
        }
        if (i == arr.length) {
            if (target == 0) {
                return 1;
            } else
                return 0;
        }
        if (dp[i][target + sum] != -1)
            return dp[i][target + sum];
        int add = ways(i + 1, arr, target - arr[i], dp);
        int sub = ways(i + 1, arr, target + arr[i], dp);

        return dp[i][target + sum] = add + sub;
    }
}