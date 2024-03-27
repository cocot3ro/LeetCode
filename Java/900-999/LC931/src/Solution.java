public class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int[][] dp = new int[matrix.length][matrix[0].length];

        System.arraycopy(matrix[0], 0, dp[0], 0, matrix[0].length);

        for (int i = 1; i < matrix.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                int min = dp[i - 1][j];

                if (j > 0) {
                    min = Math.min(min, dp[i - 1][j - 1]);
                }

                if (j < dp[0].length - 1) {
                    min = Math.min(min, dp[i - 1][j + 1]);
                }

                dp[i][j] = min + matrix[i][j];
            }
        }

        int min = dp[dp.length - 1][0];

        for (int i = 1; i < dp[0].length; i++) {
            min = Math.min(min, dp[dp.length - 1][i]);
        }

        return min;
    }
}