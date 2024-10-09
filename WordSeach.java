class Solution {
    public boolean exist(char[][] board, String word) {
       boolean res = false;
       for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                res= helper(board, word, i, j, 0, res);
                if(res){
                    return res;
                }
            }
        }
        return false;
    }
    private boolean helper(char[][] board, String word, int i, int j, int index, boolean res){
        if(index==word.length()){
            return true;
        }
        if(i<0||j<0||i>=board.length||j>=board[0].length||board[i][j]!=word.charAt(index)){
            return false;
        }
        char temp = board[i][j];
        board[i][j]='#';
        res= helper(board, word, i+1, j, index+1, res)|| 
               helper(board, word, i-1, j, index+1, res)|| 
               helper(board, word, i, j+1, index+1, res)|| 
               helper(board, word, i, j-1, index+1, res);
        board[i][j]=temp;
        return res;

    }
}