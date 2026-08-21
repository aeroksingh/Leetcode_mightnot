class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;

        if(m*n != c*r) return mat;

        int[][] rc = new int[r][c];
        int k =0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                rc[k/c][k%c] = mat[i][j];
                k++;
            }
        }
        return rc;
        
    }
}