class Solution {
    public int numRollsToTarget(int n, int k, int target) {
        int[][] dp = new int[n + 1][target + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= target; j++) {
                if (i == 1) {
                    dp[i][j] = j <= k ? 1 : 0;
                } else {
                    for (int l = 1; l <= k; l++) {
                        if (j - l >= 0) {
                            dp[i][j] = (dp[i][j] + dp[i - 1][j - l]) % 1000000007;
                        }
                    }
                }
            }
        }

        return dp[n][target];
    }
}