
class Solution {
    public int maxProduct(int[] nums) {
        int maxR = nums[0];
        int minR = nums[0];
        int res = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];

            if (num < 0) {
                int temp = maxR;
                maxR = minR;
                minR = temp;
            }

            maxR = Math.max(num, maxR * num);
            minR = Math.min(num, minR * num);

            res = Math.max(res, maxR);
        }

        return res;
    }
}
