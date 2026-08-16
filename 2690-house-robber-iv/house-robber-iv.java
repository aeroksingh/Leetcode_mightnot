class Solution {
    public int minCapability(int[] nums, int k) {
         int left = 0;
        int right = 0;

        for (int num : nums) {
            right = Math.max(right, num);
        }
        while(left<=right){
            int mid = left+(right-left)/2;

            if(check(nums,k,mid)){
            
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return left;
    }
    private boolean check(int[] nums,int k,int cap){
        int count = 0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]<=cap){
                count++;
                i++;
            }

            if(count>=k) return true;
        }
        return false;
    }
}