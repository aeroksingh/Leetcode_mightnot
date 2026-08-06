class Solution {
    public int minimumOperations(int[] nums) {
        int count = 0;
        while (true) {
            int n = mine(nums);
            if (n == Integer.MAX_VALUE)
                break;

            count++;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != 0) {
                    nums[i] -= n;
                    
                }
            }
        }
        return count;
    }

    private int mine(int[] nums) {
        int e = Integer.MAX_VALUE;
        for (int i : nums) {
            if (i != 0) {
                e = Math.min(e, i);
            }
        }
        return e;
    }
}