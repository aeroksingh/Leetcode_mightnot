class Solution {

    int MOD = 1_000_000_007;
    Integer[][][] dp;

    public int numberOfStableArrays(int zero, int one, int limit) {

        dp = new Integer[one + 1][zero + 1][2];

        int start1 = solve(one, zero, 1, limit);
        int start0 = solve(one, zero, 0, limit);

        return (start1 + start0) % MOD;
    }

    private int solve(int one, int zero, int last, int limit) {

        if (one == 0 && zero == 0) return 1;

        if (dp[one][zero][last] != null)
            return dp[one][zero][last];

        long result = 0;

        if (last == 1) { // last placed was 1, now place 0

            for (int i = 1; i <= Math.min(limit, zero); i++) {
                result = (result + solve(one, zero - i, 0, limit)) % MOD;
            }

        } else { // last placed was 0, now place 1

            for (int i = 1; i <= Math.min(limit, one); i++) {
                result = (result + solve(one - i, zero, 1, limit)) % MOD;
            }
        }

        return dp[one][zero][last] = (int) result;
    }
}