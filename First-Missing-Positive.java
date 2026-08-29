class Solution {
    public int firstMissingPositive(int[] nums) {
       int miss=1;
       Arrays.sort(nums);
        for(int e:nums){
            if(e == miss) miss++;
        }
        return miss;
    }
}
