class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int maxArea = 0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j] == 1)
                {
                    int area = dfs(i,j,grid);
                    maxArea = Math.max(area,maxArea);
                }
            }
        }
        return maxArea;
    }
    public int dfs(int r,int c , int[][] grid)
    {
        if(r<0 || c < 0 || r>=grid.length || c >= grid[0].length) return 0;

        if(grid[r][c] == 0) return 0;

        grid[r][c] = 0;
        int area = 1;

        area += dfs(r+1,c,grid);
        area += dfs(r-1,c,grid);
        area += dfs(r,c+1,grid);
        area += dfs(r,c-1,grid);

        return area;
    }
}