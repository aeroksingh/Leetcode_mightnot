class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        for (int k = 0; k < 4; k++) {
            if (check(mat, target)) return true;
            rotate(mat);
        }

        return false;
    }
    private boolean check(int[][] mat,int[][] target){
        int m = mat.length;
        int n = mat[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j] != target[i][j]) return false;
            }
        }
        return true;
    }
    private void rotate(int[][] mat){
        int m = mat.length;
        int n = mat[0].length;
        int[][] newmat = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                newmat[m-i-1][j] = mat[j][i];
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                mat[i][j] = newmat[i][j];
            }
        }
    }
}