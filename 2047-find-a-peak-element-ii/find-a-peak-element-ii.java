class Solution {
    public int[] findPeakGrid(int[][] mat) {

        int n = mat.length;
        int m = mat[0].length;

        int left = 0;
        int right = m - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            int row = 0;

            for (int i = 1; i < n; i++) {
                if (mat[i][mid] > mat[row][mid]) {
                    row = i;
                }
            }

            int current = mat[row][mid];

            int leftValue = (mid - 1 >= 0)
                    ? mat[row][mid - 1]
                    : -1;

            int rightValue = (mid + 1 < m)
                    ? mat[row][mid + 1]
                    : -1;

            if (current > leftValue && current > rightValue) {
                return new int[] { row, mid };
            }

            if (leftValue > current) {
                right = mid - 1;
            }

            else {
                left = mid + 1;
            }
        }

        return new int[] { -1, -1 };
    }
}