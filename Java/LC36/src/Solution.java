import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean isValidSudoku(char[][] board) {
        return checkRows(board) && checkCols(board) && checkBoxes(board);
    }

    private boolean checkRows(char[][] board) {
        for (char[] row : board) {
            Set<Character> set = new HashSet<>();
            for (char c : row) {
                if (c != '.' && !set.add(c)) {
                    return false;
                }
            }
        }

        return true;
    }

    private boolean checkCols(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            Set<Character> set = new HashSet<>();
            for (int j = 0; j < board[i].length; j++) {
                if (board[j][i] != '.' && !set.add(board[j][i])) {
                    return false;
                }
            }
        }

        return true;
    }

    private boolean checkBoxes(char[][] board) {

        for (int i = 1; i < board.length; i += 3) {
            for (int j = 1; j < board[i].length; j += 3) {
                Set<Character> set = new HashSet<>();
                for (int k = Math.max(i - 1, 0); k < Math.min(board.length, i + 2); k++) {
                    for (int l = Math.max(j - 1, 0); l < Math.min(board[k].length, j + 2); l++) {
                        if (board[k][l] != '.' && !set.add(board[k][l])) {
                            return false;
                        }
                    }
                }
            }
        }

        return true;
    }
}
