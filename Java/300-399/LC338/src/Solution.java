public class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n + 1];

        for (int i = 0; i < ans.length; i++) {
            ans[i] = count(Integer.toBinaryString(i));
        }

        return ans;
    }

    private int count(String s) {
        int ans = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                ans++;
            }
        }

        return ans;
    }
}