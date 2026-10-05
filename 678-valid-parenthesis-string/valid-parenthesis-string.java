class Solution {
    public boolean checkValidString(String s) {
        int n = s.length();


        boolean[][] dp = new boolean[n+1][n+1];

        dp[0][0] = true;

        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            for(int open = 0;open<=n;open++){
                if (!dp[i][open]) {
                    continue;
                }
                if(ch == '('){
                    dp[i+1][open+1] = true;
                }
                else if(ch == ')'){
                    if(open>0) dp[i+1][open-1]= true;
                }
                else{ // *

                    dp[i+1][open+1] = true;
                    if(open>0)dp[i+1][open-1] = true;
                    dp[i+1][open] = true;
                }
            }
        }
        return dp[n][0];
    }
}