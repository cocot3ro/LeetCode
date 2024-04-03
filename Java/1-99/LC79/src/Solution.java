public class Solution {
    public boolean exist(char[][] board, String word) {
        int rows = board.length;
        int cols = board[0].length;
        boolean[][] visited = new boolean[rows][cols];
        char[] wordArray = word.toCharArray();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                boolean result = dfs(board, i, j, wordArray, 0, visited);
                if (result) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, int i, int j, char[] word, int index, boolean[][] visited) {
        if (index == word.length) {
            return true;
        }
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length) {
            return false;
        }
        if (visited[i][j]) {
            return false;
        }
        if (board[i][j] != word[index]) {
            return false;
        }
        visited[i][j] = true;
        boolean result = dfs(board, i + 1, j, word, index + 1, visited) ||
                dfs(board, i - 1, j, word, index + 1, visited) ||
                dfs(board, i, j + 1, word, index + 1, visited) ||
                dfs(board, i, j - 1, word, index + 1, visited);
        visited[i][j] = false;
        return result;
    }
}
