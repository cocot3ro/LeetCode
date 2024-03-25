public class Solution {
    public int countDigits(int num) {
        String numAsString = String.valueOf(num);
        int ans = 0;

        for (int i = 0; i < numAsString.length(); i++) {
            int digit = Integer.parseInt(String.valueOf(numAsString.charAt(i)));
            if (num % digit == 0) {
                ans++;
            }
        }

        return ans;
    }
}
