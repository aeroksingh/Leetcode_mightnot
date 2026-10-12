class Solution {
    public int maxSum(List<Integer> nums, int k) {
        int mod = 1000000007;
        long ans = 0;

        int[] count = new int[31];
        for(int num: nums){
            for(int i=0;i<31;i++){
                if((num & (1 << i) )!= 0){
                    count[i]++;
                }
            }
        }
        for(int i=0;i<k;i++){
            long x = 0;
            for(int bit = 0;bit<31;bit++){
                if(count[bit]>0){
                    x |= (1L << bit);
                    count[bit]--;
                }
            }
            ans = (ans+x*x) % mod;
        }
        return (int)ans;
    }
}