public class Solution {
    public int numDecodings(String s) {
        int[] dp = new int[s.length() + 1];

        dp[0] = 1;

        for (int i = 1; i <= s.length(); i++) {
            int oneDigit = Integer.parseInt(s.substring(i - 1, i));
            int twoDigits = 0;

            if (i > 1) {
                twoDigits = Integer.parseInt(s.substring(i - 2, i));
            }

            if (oneDigit >= 1) {
                dp[i] += dp[i - 1];
            }

            if (twoDigits >= 10 && twoDigits <= 26) {
                dp[i] += dp[i - 2];
            }
        }

        return dp[s.length()];
    }
}
