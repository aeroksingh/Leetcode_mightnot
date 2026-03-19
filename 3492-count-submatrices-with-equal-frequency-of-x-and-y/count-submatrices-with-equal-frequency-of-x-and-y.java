class Solution {
    public int numberOfSubmatrices(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int ans = 0;
        int[][] xt = new int[m+1][n+1];
        int[][] yt = new int[m+1][n+1];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){

                xt[i + 1][j + 1] =
                        (grid[i][j] == 'X' ? 1 : 0)
                        + xt[i][j + 1]
                        + xt[i + 1][j]
                        - xt[i][j];
                yt[i + 1][j + 1] =
                        (grid[i][j] == 'Y' ? 1 : 0)
                        + yt[i][j + 1]
                        + yt[i + 1][j]
                        - yt[i][j];

                if (xt[i + 1][j + 1] > 0 &&
                    xt[i + 1][j + 1] == yt[i + 1][j + 1]) {
                    ans++;
                }
                
            }
        }
        return ans;
    }
}