class Solution {
    int[][] directions = {
        {0,1},
        {0,-1},
        {1,0},
        {-1,0}
    };

    public int islandPerimeter(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == 1){
                    return dfs(grid, i, j);
                }
            }
        }

        return 0;
    }

    private int dfs(int[][] grid, int i, int j){

        if(i < 0 || i >= grid.length ||
           j < 0 || j >= grid[0].length){
            return 1;
        }

        if(grid[i][j] == 0){
            return 1;
        }

        if(grid[i][j] == -1){
            return 0;
        }

        grid[i][j] = -1;

        int count = 0;

        for(int[] dir : directions){
            int newR = i + dir[0];
            int newC = j + dir[1];

            count += dfs(grid, newR, newC);
        }

        return count;
    }
}