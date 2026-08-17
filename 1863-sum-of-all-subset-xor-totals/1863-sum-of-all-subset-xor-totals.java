class Solution {
    public int subsetXORSum(int[] nums) {
        int ans = 0;

        for(int e : nums){
            ans |= e;
        }

        return ans << (nums.length - 1);
    }
}