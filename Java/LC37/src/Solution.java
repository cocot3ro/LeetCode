public class Solution {
    private final int[][] result = new int[9][9];
    private final boolean[][] modifiable = new boolean[9][9];

    public void solveSudoku(char[][] board) {
        markModifiable(board);
        recursive(0);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result.length; j++) {
                board[i][j] = String.valueOf(result[i][j]).charAt(0);
            }
        }
    }

    private void markModifiable(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                modifiable[i][j] = (board[i][j] == '.');
                if (!modifiable[i][j]) {
                    result[i][j] = Integer.parseInt(String.valueOf(board[i][j]));
                }
            }
        }
    }

    private boolean recursive(int idx) {

        if (idx == 81) {
            return true;
        }

        int row = idx / 9;
        int col = idx % 9;

        for (int candidate = 1; candidate < 10; candidate++) {
            if (modifiable[row][col]) {
                result[row][col] = candidate;
                if (isValid(row, col) && recursive(idx + 1)) {
                    return true;
                }
            } else {
                return recursive(idx + 1);
            }
        }
        result[row][col] = 0;
        return false;
    }

    private boolean isValid(int i, int j) {
        return validRow(i) && validCol(j) && validBlock(i, j);
    }

    private boolean validRow(int row) {
        boolean[] seen = new boolean[10];
        for (int i = 0; i < result.length; i++) {
            if (result[row][i] != 0 && seen[result[row][i]]) {
                return false;
            }
            seen[result[row][i]] = true;
        }

        return true;
    }

    private boolean validCol(int col) {
        boolean[] seen = new boolean[10];
        for (int[] ints : result) {
            if (ints[col] != 0 && seen[ints[col]]) {
                return false;
            }
            seen[ints[col]] = true;
        }

        return true;
    }

    private boolean validBlock(int row, int col) {
        boolean[] seen = new boolean[10];
        for (int i = (row / 3) * 3; i < (row / 3) * 3 + 3; i++) {
            for (int j = (col / 3) * 3; j < (col / 3) * 3 + 3; j++) {
                if (result[i][j] != 0 && seen[result[i][j]]) {
                    return false;
                }
                seen[result[i][j]] = true;
            }
        }
        return true;
    }
}
