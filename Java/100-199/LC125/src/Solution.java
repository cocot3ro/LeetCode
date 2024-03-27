import java.util.Locale;

public class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isAlphabetic(c) || Character.isDigit(c)) {
                str.append(c);
            }
        }

        int length = str.length();

        for (int i = 0; i < length / 2; i++) {
            char c1 = str.charAt(i);
            char c2 = str.charAt(length - 1 - i);

            if (c1 != c2) {
                return false;
            }
        }

        return true;
    }
}
