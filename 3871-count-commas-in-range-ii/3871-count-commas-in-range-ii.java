class Solution {
    public long countCommas(long n) {
        long ans = 0;

        long start = 1000;
        int comma = 1;
        if(n<=999) return 0;

        
        while(start <= n){
            long end = start * 1000 - 1;
            long upper = Math.min(n, end);
            if(upper >= start){
                ans += (upper-start+1) * comma;
            }

            start *= 1000;
            comma++;
        }
        return ans;
    }
}