class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int sum=0;  
        


        for(int i=0;i<n;i++){
            sum = 0;
            for (int j=0;j<i;j++){
                sum += nums[j];
            }
            left[i] = sum;
        }
        for(int i = n-1;i>=0;i--){
            sum =0;
            for(int j=i+1;j<n;j++){
                sum += nums[j];
            }
            right[i] = sum;
        }

        
        for(int i=0;i<n;i++){
            nums[i] = Math.abs(right[i]-left[i]);
        }
        return nums;


    }
}