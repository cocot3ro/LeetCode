public class Solution {
    public int islandPerimeter(int[][] grid) {
        int ans = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 0) continue;
                
                if (outBounds(grid, i + 1, j) || grid[i + 1][j] == 0) ans++;
                if (outBounds(grid, i, j + 1) || grid[i][j + 1] == 0) ans++;
                if (outBounds(grid, i - 1, j) || grid[i - 1][j] == 0) ans++;
                if (outBounds(grid, i, j - 1) || grid[i][j - 1] == 0) ans++;
            }
        }
        
        return ans;
    }
    
    private static boolean outBounds(int[][] grid, int i, int j) {
        return !(i >= 0 && i < grid.length && j >= 0 && j < grid[i].length);
    }
}