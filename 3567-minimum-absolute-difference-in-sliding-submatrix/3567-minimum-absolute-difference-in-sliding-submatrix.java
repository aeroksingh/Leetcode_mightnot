import java.util.*;

class Solution {
    public int[][] minAbsDiff(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;

        int[][] ans = new int[m - k + 1][n - k + 1];

        for (int i = 0; i <= m - k; i++) {
            for (int j = 0; j <= n - k; j++) {

                // Step 1: collect unique values
                Set<Integer> set = new HashSet<>();

                for (int r = i; r < i + k; r++) {
                    for (int c = j; c < j + k; c++) {
                        set.add(grid[r][c]);
                    }
                }

                List<Integer> list = new ArrayList<>(set);
                Collections.sort(list);
                int minDiff = Integer.MAX_VALUE;

                for (int x = 1; x < list.size(); x++) {
                    minDiff = Math.min(minDiff, list.get(x) - list.get(x - 1));
                }
                if (list.size() <= 1) {
                    minDiff = 0;
                }

                ans[i][j] = minDiff;
            }
        }

        return ans;
    }
}