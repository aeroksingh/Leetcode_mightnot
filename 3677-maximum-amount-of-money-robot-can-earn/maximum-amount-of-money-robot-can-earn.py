class Solution(object):
    def maximumAmount(self, coins):
        m, n = len(coins), len(coins[0])
        
        # dp[i][j][k] → max money at (i,j) with k skips used
        dp = [[[-float('inf')] * 3 for _ in range(n)] for _ in range(m)]
        
        # Start
        dp[0][0][0] = coins[0][0]
        if coins[0][0] < 0:
            dp[0][0][1] = 0  # skip it
        
        for i in range(m):
            for j in range(n):
                for k in range(3):
                    if dp[i][j][k] == -float('inf'):
                        continue
                    
                    for ni, nj in [(i+1, j), (i, j+1)]:
                        if ni < m and nj < n:
                            val = coins[ni][nj]
                            
                            # Option 1: take coin
                            dp[ni][nj][k] = max(
                                dp[ni][nj][k],
                                dp[i][j][k] + val
                            )
                            
                            # Option 2: skip negative coin
                            if val < 0 and k < 2:
                                dp[ni][nj][k+1] = max(
                                    dp[ni][nj][k+1],
                                    dp[i][j][k]
                                )
        
        return max(dp[m-1][n-1])