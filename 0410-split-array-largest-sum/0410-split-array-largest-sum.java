class Solution {
    public int splitArray(int[] nums, int k) {
        int left = 0;
        int right = 0;

        for (int e : nums) {
            left = Math.max(left, e);
            right += e;
        }

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int cal = findp(nums, mid);
            if (cal <= k)
                right = mid - 1;
            else
                left = mid + 1;
        }
        return left;
    }

    private int findp(int[] nums, int mid) {
        int currk = 1;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (sum + nums[i] <= mid)
                sum += nums[i];
            else {
                currk++;
                sum = nums[i];
            }
        }
        return currk;
    }
}