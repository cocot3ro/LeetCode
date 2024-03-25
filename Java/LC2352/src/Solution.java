public class Solution {
    public int equalPairs(int[][] grid) {
        int ans = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                int[] col = new int[grid[0].length];
                for (int k = 0; k < grid[0].length; k++) {
                    col[k] = grid[k][j];
                }
                if (equals(grid[i], col))
                    ans++;
            }
        }

        return ans;
    }

    private boolean equals(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i])
                return false;
        }
        return true;
    }
}
