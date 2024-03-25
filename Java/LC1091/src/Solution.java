public class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        if (grid[0][0] != 0 || grid[grid.length - 1][grid.length - 1] != 0) {
            return -1;
        }

        if (grid.length == 2 && grid[0][0] == 0 && grid [1][1] == 0) {
            return 2;
        }

        int recorrido = -1;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                for (int f = Math.max(0, i - 1); f < Math.min(grid.length, i + 2); f++) {
                    for (int c = Math.max(0, j - 1); c < Math.min(grid.length, j + 2); c++) {
                        if (!(f == i && c == j) && grid[f][c] == 0) {
                            recorrido += 1;
                        }
                    }
                }
            }
        }

        return recorrido;
    }
}
