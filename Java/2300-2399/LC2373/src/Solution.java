public class Solution {
    public int[][] largestLocal(int[][] grid) {
        int[][] ans = new int[grid.length - 2][grid.length - 2];

        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[i].length; j++) {

                int r = i + 1;
                int c = j + 1;

                int max = Integer.MIN_VALUE;

                for (int k = Math.max(0, r - 1); k < Math.min(r + 2, grid.length + 2); k++) {
                    for (int l = Math.max(0, c - 1); l < Math.min(c + 2, grid[k].length + 2); l++) {
                        max = Math.max(max, grid[k][l]);
                    }
                }

                ans[i][j] = max;
            }
        }

        return ans;
    }
}