class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();

        int lb = 0;
        int rb = matrix[0].length - 1;

        int tb = 0;
        int bb = matrix.length - 1;

        while (lb <= rb && tb <= bb) {

            // Top row
            for (int i = lb; i <= rb; i++) {
                res.add(matrix[tb][i]);
            }
            tb++;

            // Right column
            for (int i = tb; i <= bb; i++) {
                res.add(matrix[i][rb]);
            }
            rb--;

            // Bottom row
            if (tb <= bb) {
                for (int i = rb; i >= lb; i--) {
                    res.add(matrix[bb][i]);
                }
                bb--;
            }

            // Left column
            if (lb <= rb) {
                for (int i = bb; i >= tb; i--) {
                    res.add(matrix[i][lb]);
                }
                lb++;
            }
        }

        return res;
    }
}