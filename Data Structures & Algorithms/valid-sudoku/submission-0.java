class Solution {

    public boolean isValidSudoku(char[][] board) {
        HashSet<String> set = new HashSet<>();
        for(int i = 0;i<board.length;i++)
        {
            for(int j = 0;j<board.length;j++)
            {
                char ch = board[i][j];
                if(ch != '.'){
                    if(!set.add("row" + i + ch) || !set.add("col"+j+ch) || !set.add("subox" + i/3 + j/3 + ch))
                        return false;
                }
            }
        }
        return true;
    }
}
