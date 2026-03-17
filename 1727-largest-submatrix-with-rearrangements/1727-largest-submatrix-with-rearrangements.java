class Solution {
    public int largestSubmatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int maxArea = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j] == 1 && i>0 ){
                    matrix[i][j] +=matrix[i-1][j];
                }
            }

            Integer[] heights = new Integer[n];
            for(int k=0;k<n;k++){
                heights[k]= matrix[i][k];
            }


            Arrays.sort(heights,Collections.reverseOrder());

            int base =0;
           
            for(int k=0;k<n;k++){
                base = k+1;
                int h = heights[k];
                maxArea = Math.max(maxArea,base*h);
            }
        }

        return maxArea;
    }
}