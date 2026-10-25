class Solution {
    public int orangesRotting(int[][] grid) {
        int fresh = 0;
        Queue<int[]> q = new LinkedList<>();

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 2) {
                    q.offer(new int[] { i, j });
                } else if (grid[i][j] == 1) {
                    fresh++;
                }
            }
        }

        return bfs(grid, q, fresh);
    }

    private int bfs(int[][] grid, Queue<int[]> q, int fresh) {
        int m = grid.length;
        int n = grid[0].length;
        int min = 0;
        int[] dr = { 1, -1, 0, 0 };
        int[] dc = { 0, 0, -1, 1 };

        while (!q.isEmpty() && fresh > 0) {
            int size = q.size();
            min++;

            for (int k = 0; k < size; k++) {
                int[] curr = q.poll();
                int row = curr[0];
                int col = curr[1];

                for (int i = 0; i < 4; i++) {
                    int newR = row + dr[i];
                    int newC = col + dc[i];

                    if (newR < 0 || newC < 0 || newR >= m || newC >= n) {
                        continue;
                    }

                    if (grid[newR][newC] != 1)
                        continue;

                    grid[newR][newC] = 2;
                    fresh--;
                    q.offer(new int[] { newR, newC });
                }
            }
        }

        return fresh == 0 ? min : -1;
    }
}