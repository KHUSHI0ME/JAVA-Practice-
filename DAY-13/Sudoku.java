class Sudoku {

    public boolean isSafe(char[][] board, int row, int col, char c) {

        // Row and column check
        for (int i = 0; i < 9; i++) {

            // Column check
            if (board[i][col] == c) {
                return false;
            }

            // Row check
            if (board[row][i] == c) {
                return false;
            }
        }

        // 3x3 Grid check
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;

        for (int r = sr; r < sr + 3; r++) {
            for (int d = sc; d < sc + 3; d++) {

                if (board[r][d] == c) {
                    return false;
                }
            }
        }

        return true;
    }

    public boolean helper(char[][] board, int row, int col) {

        // Base case
        if (row == board.length) {
            return true;
        }

        // Find next cell
        int nrow;
        int ncol;

        if (col != board.length - 1) {
            nrow = row;
            ncol = col + 1;
        } else {
            nrow = row + 1;
            ncol = 0;
        }

        // If cell is already filled
        if (board[row][col] != '.') {

            if (helper(board, nrow, ncol)) {
                return true;
            }

        } else {

            // Try numbers 1 to 9
            for (int i = 1; i <= 9; i++) {

                char c = (char) (i + '0');

                if (isSafe(board, row, col, c)) {

                    // Place number
                    board[row][col] = c;

                    // Recursively solve
                    if (helper(board, nrow, ncol)) {
                        return true;
                    }

                    // Backtrack
                    board[row][col] = '.';
                }
            }
        }

        return false;
    }

    public void solveSudoku(char[][] board) {

        if (board == null || board.length == 0) {
            return;
        }

        helper(board, 0, 0);
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

    Sudoku obj = new Sudoku();

    obj.solveSudoku(board);

    // Print solved board
    for(int i = 0; i < 9; i++) {
        for(int j = 0; j < 9; j++) {
            System.out.print(board[i][j] + " ");
        }
        System.out.println();
    }
}

}