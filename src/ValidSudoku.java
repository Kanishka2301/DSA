public class ValidSudoku {
    public static boolean valid(int row, int col, char[][] board) {
        char c = board[row][col];
        for (int i = 0; i < 9; i++) {
            if (i != row && board[i][col] == c) return false;
            if (i != col && board[row][i] == c) return false;
        }
        for (int i = (row / 3) * 3; i < ((row / 3) * 3) + 3; i++) {
            for (int j = (col / 3) * 3; j < ((col / 3) * 3) + 3; j++) {
                if (board[i][j] == c && (i != row || j != col)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isValid(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    if (!valid(i, j, board)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        char[][] board = {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };
        System.out.println(isValid(board));
    }
}