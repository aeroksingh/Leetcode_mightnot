class Solution {
    public int dominantIndex(int[] nums) {
        int n = nums.length;
        for(int i =0;i<n;i++){
            int a = nums[i];
            boolean dominant = true;
            for(int j=0;j<n;j++){
                if(i==j) continue;
                if(a < nums[j] * 2){
                    dominant = false;
                    break;
                }
                
            }
            if(dominant) return i;
        }
        return -1;
    }
}