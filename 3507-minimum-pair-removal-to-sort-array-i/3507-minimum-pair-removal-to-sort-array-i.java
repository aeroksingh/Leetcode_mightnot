class Solution {
    public int minimumPairRemoval(int[] nums) {
        int n = nums.length;
        int count = 0;

        while (!check(nums, n)) {
            int minSum = Integer.MAX_VALUE;
            int index = 0;

            for (int i = 1; i < n; i++) {
                int sum = nums[i - 1] + nums[i];
                if (sum < minSum) {
                    minSum = sum;
                    index = i - 1;
                }
            }
            nums[index] = nums[index] + nums[index + 1];
            for (int i = index + 1; i < n - 1; i++) {
                nums[i] = nums[i + 1];
            }

            n--; 
            count++;
        }

        return count;
    }

    private boolean check(int[] nums, int n) {
        for (int i = 1; i < n; i++) {
            if (nums[i - 1] > nums[i]) return false;
        }
        return true;
    }
}