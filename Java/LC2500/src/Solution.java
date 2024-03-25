import java.util.Arrays;

public class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int ans = 0;

        for (int i = 0; i < grid.length; i++) {
            Arrays.sort(grid[i]);
        }

        for (int j = grid[0].length; j > 0; j--) {
            int greatest = -1;
            for (int i = 0; i < grid.length; i++) {
                if (grid[i][j - 1] > greatest) {
                    greatest = grid[i][j - 1];
                }
            }
            ans += greatest;
        }

        return ans;
    }
}
