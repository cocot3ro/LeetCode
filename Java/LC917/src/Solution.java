public class Solution {
    public String reverseOnlyLetters(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0, j = s.length(); i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                j = nextIndex(s, j);
                sb.append(s.charAt(j));
            } else {
                sb.append(s.charAt(i));
            }
        }

        return sb.toString();
    }

    private int nextIndex(String s, int currIndex) {
        int i;
        for (i = currIndex - 1; i >= 0; i--) {
            if (Character.isLetter(s.charAt(i))) {
                break;
            }
        }
        return i;
    }
}
