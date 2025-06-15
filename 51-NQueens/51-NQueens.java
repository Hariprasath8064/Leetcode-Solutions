// Last updated: 6/15/2025, 5:29:20 PM
class Solution {
    public List<List<String>> solveNQueens(int n) {
        char [] [] board = new char [n][n];
        
        //filling dots
        for(int i = 0;i< n ;i++)
        {
            for(int j=0;j<n;j++)
            {
                board[i][j] = '.';
            }
        }
        // converting into array
        List<List<String>> ans = new ArrayList<>();
        nqueens(board,0,ans);
        return ans;

        
    }

    static void nqueens(char[][] board , int row , List<List<String>> list)
    {
        int n = board.length;
        if(row == n)
        {
            list.add(construct(board));
            return;
        }
        for (int col = 0; col < n; col++)
        {
            if(isSafe(board, row, col)) 
            {
                board[row][col] = 'Q';
                nqueens(board, row + 1, list);
                board[row][col] = '.';
            }
        }
    }

    //constructing board
    static List<String> construct(char[][] board){
        int n = board.length;
        List<String> pos = new ArrayList<>();
        for(int i = 0; i<n;i++)
        {
            String row = new String(board[i]);
            pos.add(row);   
        }
        return pos;
    }
    static boolean isSafe(char[][] board, int row, int col) {
        int n = board.length;

        //for checking vertical row
        for (int i = 0; i < row; i++) {
            if(board[i][col] == 'Q') {
                return false;
            }
        }

        //for checking left diagonal

        int maxLeft = Math.min(row, col);

        for (int i = 1; i <= maxLeft; i++) {
            if(board[row - i][col - i] == 'Q') {
                return false;
            }
        }

        //for checking right diagonal

        int maxRight = Math.min(row, n - 1 - col);

        for (int i = 1; i <= maxRight; i++) {
            if(board[row - i][col + i] == 'Q') {
                return false;
            }
        }

        return true;
    }

}