
class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    bfs(grid, i, j);
                }
            }
        }
        return count;
    }

    private void bfs(char[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length ||
            j < 0 || j >= grid[0].length ||
            grid[i][j] != '1') {
            return;
        }

        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, 1, -1};

        grid[i][j] = '0';

        for (int k = 0; k < 4; k++) {
            int newR = i + dr[k];
            int newC = j + dc[k];

            bfs(grid, newR, newC);
        }
    }
}
