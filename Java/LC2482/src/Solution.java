public class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int[][] rows = new int[grid.length][2];
        int[][] cols = new int[grid[0].length][2];

        for (int i = 0; i < grid.length; i++) {
            int zeros = 0;
            int ones = 0;
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 0) {
                    zeros++;
                } else {
                    ones++;
                }
            }
            rows[i][0] = zeros;
            rows[i][1] = ones;
        }

        for (int i = 0; i < grid[0].length; i++) {
            int zeros = 0;
            int ones = 0;
            for (int[] ints : grid) {
                if (ints[i] == 0) {
                    zeros++;
                } else {
                    ones++;
                }
            }
            cols[i][0] = zeros;
            cols[i][1] = ones;
        }

        int[][] result = new int[grid.length][grid[0].length];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                result[i][j] = rows[i][1] + cols[j][1] - rows[i][0] - cols[j][0];
            }
        }

        return result;
    }
}