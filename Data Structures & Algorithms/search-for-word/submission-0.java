class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i = 0;i<board.length;i++)
        {
            for(int j = 0;j<board[i].length;j++)
            {
                if(board[i][j] == word.charAt(0)){
                    if(backtrack(board,i,j,word,0))
                        return true;
                }
            }
        }
        return false;
    }

    public boolean backtrack(char[][] board,int row,int col, String word,int index){
        if(index == word.length())
            return true;

        if(row < 0 || row >= board.length || col < 0 || col >= board[0].length || board[row][col] != word.charAt(index)){
        return false;
        }

        char temp = board[row][col];
        board[row][col] = '#';

        boolean found = backtrack(board,row+1,col,word,index+1) || backtrack(board,row-1,col,word,index+1) || backtrack(board,row,col+1,word,index+1) || backtrack(board,row,col-1,word,index+1);

        board[row][col] = temp;
        return found;
    }
}
