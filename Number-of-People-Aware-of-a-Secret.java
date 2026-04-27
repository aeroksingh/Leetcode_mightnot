class Solution {
    private Long[] mem;

    public int peopleAwareOfSecret(int n, int delay, int forget) {
        long total = 0;
        mem = new Long[n + 1];
        long MOD = 1000000007;
        for (int i = n - forget + 1; i <= n; i++) {
            if (i >= 1) {
                total = (total + solve(i, delay, forget)) % MOD;
            }
        }
        return (int) total;
    }

    private long solve(int day, int delay, int forget) {
        if (day == 1)
            return 1;
        if (day <= 0)
            return 0;
        if (mem[day] != null)
            return mem[day];

        long MOD = 1000000007;
        long result = 0;
        for (int i = day - forget + 1; i <= day - delay; i++) {
            if (i >= 1) {
                result = (result + solve(i, delay, forget)) % MOD;
            }
        }
        return mem[day] = result;
    }
}
