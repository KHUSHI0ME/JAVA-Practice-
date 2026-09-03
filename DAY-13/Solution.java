import java.util.*;

class Solution {

    public boolean isSafe(int row, int col, char[][] board) {

        // HORIZONTAL
        for (int i = 0; i < col; i++) {
            if (board[row][i] == 'Q') {
                return false;
            }
        }

        // VERTICAL
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // UPPER LEFT
        int r = row;
        for (int c = col; c >= 0 && r >= 0; c--, r--) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        // UPPER RIGHT
        r = row;
        for (int c = col; c < board.length && r >= 0; c++, r--) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        // LOWER LEFT
        r = row;
        for (int c = col; c >= 0 && r < board.length; c--, r++) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        // LOWER RIGHT
        r = row;
        for (int c = col; c < board.length && r < board.length; c++, r++) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        return true;
    }

    public void saveBoard(char[][] board, List<List<String>> allBoards) {

        List<String> newBoard = new ArrayList<>();

        for (int i = 0; i < board.length; i++) {

            String row = "";

            for (int j = 0; j < board.length; j++) {

                if (board[i][j] == 'Q') {
                    row += 'Q';
                } else {
                    row += '.';
                }
            }

            newBoard.add(row);
        }

        allBoards.add(newBoard);
    }

    public void helper(char[][] board, int col, List<List<String>> allBoards) {

        // All queens placed
        if (col == board.length) {
            saveBoard(board, allBoards);
            return;
        }

        // Try every row in current column
        for (int row = 0; row < board.length; row++) {

            if (isSafe(row, col, board)) {

                board[row][col] = 'Q';

                helper(board, col + 1, allBoards);

                // BACKTRACK
                board[row][col] = '.';
            }
        }
    }

    public List<List<String>> solveNQueens(int n) {

        List<List<String>> allBoards = new ArrayList<>();

        char[][] board = new char[n][n];

        // Initialize board with '.'
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        helper(board, 0, allBoards);

        return allBoards;
    }

    // MAIN METHOD FOR VS CODE
    public static void main(String[] args) {

        Solution obj = new Solution();

        int n = 4;

        List<List<String>> result = obj.solveNQueens(n);

        for (List<String> board : result) {

            for (String row : board) {
                System.out.println(row);
            }

            System.out.println();
        }
    }
}