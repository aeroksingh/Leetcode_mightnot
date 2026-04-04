class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0,curr=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i] == 1){
                curr++;
                count = Math.max(count,curr);
            }else{
                curr=0;
            }
        }
        return count;
    }
}