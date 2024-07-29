public class WordSearch{
    public static void main(String[] args) {
       
        char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        System.out.println(checkWord(board, "SEE"));
    }
    public static boolean checkWord(char[][] board, String word) {
        boolean res=false;
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                res= helper(board, word, i, j, 0, res);
                if(res){
                    return res;
                }
            }
        }
       //res= helper(board, word, 0, 0, 0, res);
        return res;
    }
    public static boolean helper(char[][] board, String word, int i, int j, int index, boolean res){
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