class Solution {
    public int maxProductPath(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int mod = 1_000_000_007;

        long dpMax[][] = new long[m][n];
        long dpMin[][] = new long[m][n];

        dpMax[0][0] = grid[0][0];
        dpMin[0][0] = grid[0][0];

        for(int i=1;i<m;i++){
            dpMax[i][0] = dpMax[i-1][0] * grid[i][0];
            dpMin[i][0] = dpMin[i-1][0] * grid[i][0];
        }
        for(int j=1;j<n;j++){
            dpMax[0][j] = dpMax[0][j-1] * grid[0][j];
            dpMin[0][j] = dpMin[0][j-1] * grid[0][j];
        }

        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                int val = grid[i][j];

                long topmax = dpMax[i-1][j] * val;
                long topmin = dpMin[i-1][j] * val;
                long leftmin = dpMin[i][j-1] * val;
                long leftmax = dpMax[i][j-1] * val;

                dpMin[i][j] = Math.min(Math.min(topmin,topmax),Math.min(leftmin,leftmax));
                dpMax[i][j] = Math.max(Math.max(topmin,topmax),Math.max(leftmin,leftmax));
            }
        }
        long ans = dpMax[m-1][n-1];
        return ans <0 ? -1 : (int)(ans % mod);

    }
}