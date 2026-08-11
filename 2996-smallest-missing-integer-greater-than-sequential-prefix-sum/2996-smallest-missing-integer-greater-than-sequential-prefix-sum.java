class Solution {
    public int missingInteger(int[] nums) {
        
        int sum = nums[0];
        int n = nums.length;

        for(int i=1;i<n;i++){
            if(nums[i] == nums[i-1] + 1){
                sum += nums[i];
            }else break;
        }
        boolean[] pre = new boolean[51];
        for (int num : nums) {
            pre[num] = true;
        }

        while(sum < pre.length && pre[sum]) {
            sum++;
        }
        return sum;

    }
}