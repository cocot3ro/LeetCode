import java.util.Arrays;

public class Solution {
    public String sortVowels(String s) {
        StringBuilder sb = new StringBuilder();

        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);
        StringBuilder chars = new StringBuilder(new String(charArray));

        int nextIndex = nextIndex(chars, -1);
        for (int i = 0; i < s.length(); i++) {
            if (isVowel(s.charAt(i)) && nextIndex != -1) {
                sb.append(chars.charAt(nextIndex));
                nextIndex = nextIndex(chars, nextIndex);
            } else {
                sb.append(s.charAt(i));
            }
        }

        return sb.toString();
    }

    private int nextIndex (StringBuilder sb, int currIndex) {
        for (int i = currIndex + 1; i < sb.length(); i++) {
            if (isVowel(sb.charAt(i))) {
                return i;
            }
        }
        return -1;
    }

    private boolean isVowel(char c) {
        return switch (c) {
            case 'a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U' -> true;
            default -> false;
        };
    }

}
