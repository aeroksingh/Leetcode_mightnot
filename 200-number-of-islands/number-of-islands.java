class Solution {
    int[][] directions = {
        {0,1},
        {0,-1},
        {1,0},
        {-1,0}
    };

    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int count = 0;

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){

                if(grid[i][j] == '1'){
                    count++;
                    dfs(grid, i, j);
                }
            }
        }

        return count;
    }

    private void dfs(char[][] grid, int i, int j){

        if(i < 0 || i >= grid.length ||
           j < 0 || j >= grid[0].length){
            return;
        }

        if(grid[i][j] == '0')
            return;

        grid[i][j] = '0';

        for(int[] dir : directions){

            int newR = i + dir[0];
            int newC = j + dir[1];

            dfs(grid, newR, newC);
        }
    }
}