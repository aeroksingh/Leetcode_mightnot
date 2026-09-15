class Solution {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        long[][] dp = new long[n][amount+1];
        for(long[] d : dp){
            Arrays.fill(d,-1);
        }
        int ans = (int) help(0,coins,amount,dp);
        if(ans == Integer.MAX_VALUE) return -1;
        return ans;
    }
    private long help(int index, int[] coins, int amount, long[][] dp){
        if(index == coins.length){
            if(amount == 0){
                return 0;
            }else{
                return Integer.MAX_VALUE;
            }
        }
        if(dp[index][amount] != -1) return dp[index][amount];
        long skip = help(index+1,coins,amount,dp);
        if(amount<coins[index]){
            return skip;
        }
        long pick = 1 + help(index,coins,amount-coins[index],dp);
        return dp[index][amount] = Math.min(skip,pick);
    }
}