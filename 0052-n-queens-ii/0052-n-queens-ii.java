class Solution {
    
    int count =0;
    public int totalNQueens(int n) {
        char[][] board = new char[n][n];
        for(int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        find(0,board);
        return count;
    }
    private int find(int row,char[][] board){
        
       if(row == board.length){
            count++;
            return count;
       }
       for(int i=0;i<board.length;i++){
            if(valid(board,row,i)){
                board[row][i] = 'Q';
                find(row+1,board);
                board[row][i] ='.';
            }
       }
       return 0;
    }
    private List<String> construct(char[][] board) {

        List<String> list = new ArrayList<>();

        for(char[] row : board) {
            list.add(new String(row));
        }

        return list;
    }

    private boolean valid(char[][] board,int row,int col){
        
        for(int i=row-1;i>=0;i--){
            if(board[i][col] =='Q') return false;
        }

        // upper left diagonal
        int i = row - 1;
        int j = col - 1;

        while(i >= 0 && j >= 0) {

            if(board[i][j] == 'Q') {
                return false;
            }

            i--;
            j--;
        }

        i=row-1;
        j=col+1;

        while(i>=0 && j<board.length){
            if(board[i][j] == 'Q') {
                return false;
            }

            i--;
            j++;
        }
        return true;
        
    }
}