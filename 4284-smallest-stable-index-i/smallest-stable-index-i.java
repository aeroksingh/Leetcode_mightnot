class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int score = -1;

        for(int i=0;i<n;i++)
        {
            int maxx = max(nums,0,i);
            int minn = min(nums,i,n-1);

            if(maxx - minn <= k){
                return i;
            }

        }
        return score;
    }
    private int max(int[] nums, int start,int end){
        int m = Integer.MIN_VALUE;

        for(int i= start;i<=end;i++){
            m = Math.max(m,nums[i]);
        }
        return m;
    }

    private int min(int[] nums, int start, int end){
        int m = Integer.MAX_VALUE;

        for(int i=start;i<=end;i++){
            m = Math.min(m,nums[i]);
        }
        return m;
    }
}