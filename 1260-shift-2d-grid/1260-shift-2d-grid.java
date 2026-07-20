class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            griddy(grid);
        }

        for (int[] row : grid) {
            List<Integer> list = new ArrayList<>();
            for (int num : row) {
                list.add(num);
            }
            res.add(list);
        }

        return res;
    }

    public void griddy(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;

        int[][] temp = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (j == n - 1) {

                    if (i == m - 1) {
                        temp[0][0] = grid[i][j];
                    } else {
                        temp[i + 1][0] = grid[i][j];
                    }

                } else {
                    temp[i][j + 1] = grid[i][j];
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = temp[i][j];
            }
        }
    }
}