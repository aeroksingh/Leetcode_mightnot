class Solution {
    int mod = 12345;

    public int[][] constructProductMatrix(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        long prefix = 1;
        long suffix = 1;

        int[][] result = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                result[i][j] = (int)prefix;
                prefix = (prefix * grid[i][j]) % mod;
            }
        }

        for(int i=m-1;i>=0;i--){
            for(int j=n-1;j>=0;j--){
                result[i][j] = (int)((result[i][j] * suffix) % mod);
                suffix = (suffix * grid[i][j]) % mod;
            }
        }

        return result;
    }
}