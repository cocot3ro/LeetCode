public class Solution {
    public String longestPalindrome(String s) {
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < i + 1; j++) {
                String subString = s.substring(j, s.length() - i + j);
                if (isPalindrome(subString)) {
                    return subString;
                }
            }
        }

        return "";
    }

    private boolean isPalindrome(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
