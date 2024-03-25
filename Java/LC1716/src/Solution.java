public class Solution {
    public int totalMoney(int n) {
        int ans = 0;

        int weeks = n / 7;
        int days = n % 7;

        for (int i = 0; i < weeks; i++) {
            ans += 28 + 7 * i;
        }

        for (int i = 0; i < days; i++) {
            ans += weeks + i + 1;
        }

        return ans;
    }
}