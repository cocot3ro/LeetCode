import java.util.Arrays;

public class Solution {
    public int[] plusOne(int[] digits) {
        boolean carry = true;
        for (int i = digits.length - 1; i >= 0 && carry; i--) {
            if (carry) {
                digits[i]++;
            }
            if (digits[i] == 10) {
                digits[i] = 0;
            } else {
                carry = false;
            }
        }
        if (carry) {
            int[] ans = new int[digits.length + 1];
            System.arraycopy(digits, 0, ans, 1, digits.length);
            ans[0] = 1;
            return ans;
        }
        return digits;
    }
}
