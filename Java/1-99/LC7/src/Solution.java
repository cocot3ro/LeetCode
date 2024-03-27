public class Solution {
    public int reverse(int x) {
        int reversed = 0;
        int remainder;
        int sign = 1;

        if (x < 0) {
            sign = -1;
            x *= -1;
        }

        while (x > 0) {
            remainder = x % 10;
            x /= 10;

            if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && remainder > 7)) {
                return 0;
            }

            if (reversed < Integer.MIN_VALUE / 10) {
                return 0;
            }

            reversed = reversed * 10 + remainder;
        }

        return reversed * sign;
    }
}