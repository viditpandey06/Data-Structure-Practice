
public class Game {

    public static void main(String[] args) {
        int[][] board = {
            {0, 1, 0},
            {0, 0, 1},
            {1, 1, 1},
            {0, 0, 0}
        };
        gameOfLife(board);

        // Print the updated board
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void gameOfLife(int[][] board) {
        int newVal, orgnVal;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                board[i][j] = board[i][j] * -1;
            }
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                orgnVal = board[i][j];
                newVal = liveCell(board, i, j);
                board[i][j] = (newVal * 10) + Math.abs(orgnVal);
            }
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] != 1) {
                    board[i][j] = (board[i][j] / 10);
                }
            }
        }
    }

    private static int liveCell(int board[][], int i, int j) {
        int live = 0;
        if (i > 0 && j > 0 && board[i - 1][j - 1] == 1) {
            live++;
        }
        if (i > 0 && board[i - 1][j] == 1) {
            live++;
        }
        if ((i > 0 && j < board[0].length - 1) && (board[i - 1][j + 1] == 1)) {
            live++;
        }
        if (j > 0 && board[i][j - 1] == 1) {
            live++;
        }
        if (j < board[0].length - 1 && board[i][j + 1] == 1) {
            live++;
        }
        if (i < board.length - 1 && j > 0 && board[i + 1][j - 1] == 1) {
            live++;
        }
        if (i < board.length - 1 && board[i + 1][j] == 1) {
            live++;
        }
        if (i < board.length - 1 && j < board[0].length - 1 && board[i + 1][j + 1] == 1) {
            live++;
        }
        if (live == 3) {
            return 1;
        } else if (live < 2) {
            return 0;
        } else if (live >= 2 && live < 4) {
            int temp = board[i][j];
            if (temp != 1) {
                return (board[i][j] / 10);
            } else {
                return 1;
            }
        } else if (live >= 4) {
            return 0;
        }
        return 22;
    }
}
