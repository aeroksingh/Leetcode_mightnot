class Solution {

    public int rob(int[] nums) {

        int n = nums.length;

        if (n == 1) return nums[0];

        int[] arr1 = new int[n - 1];
        int[] arr2 = new int[n - 1];

        for (int i = 0; i < n - 1; i++) {
            arr1[i] = nums[i];
            arr2[i] = nums[i + 1];
        }

        return Math.max(robLinear(arr1), robLinear(arr2));
    }

    private int robLinear(int[] nums) {

        int n = nums.length;

        if (n == 1) return nums[0];

        int[] dp = new int[n];

        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < n; i++) {
            int take = nums[i] + dp[i - 2];
            int skip = dp[i - 1];
            dp[i] = Math.max(take, skip);
        }

        return dp[n - 1];
    }
}