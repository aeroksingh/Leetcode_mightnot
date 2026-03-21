class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        int temp;
        for(int i=0;i<k/2;i++){
            int trow = x+i, brow = x+k-1-i;
            for(int j=0;j<k;j++){
                temp = grid[trow][y+j];
                grid[trow][y+j] = grid[brow][y+j];
                grid[brow][y+j] = temp;
            }
            
        
        }
        return grid;
    }
}