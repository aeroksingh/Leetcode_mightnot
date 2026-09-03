class Solution {
    public boolean uniformArray(int[] nums) {
        int n = nums.length;

        int min = nums[0];
        boolean alleven = true;

        for (int i = 0; i < n; i++) {
            if (nums[i] % 2 != 0) {
                alleven = false;
            }

            min = Math.min(min, nums[i]);
        }

        if (alleven) return true;

        if (min % 2 == 0) return false;

        return true;
    }
}