public class Solution {
    public int myAtoi(String s) {
        int i = 0;
        int sign = 1;
        int result = 0;
        int length = s.length();

        // Discard whitespaces in the beginning
        while (i < length && s.charAt(i) == ' ') {
            i++;
        }

        // Check if optional sign if it exists
        if (i < length && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            sign = (s.charAt(i++) == '-') ? -1 : 1;
        }

        // Build the result and check for overflow/underflow condition
        while (i < length && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
            if (result > Integer.MAX_VALUE / 10 ||
                    (result == Integer.MAX_VALUE / 10 && s.charAt(i) - '0' > Integer.MAX_VALUE % 10)) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + (s.charAt(i++) - '0');
        }

        return result * sign;
    }
}
