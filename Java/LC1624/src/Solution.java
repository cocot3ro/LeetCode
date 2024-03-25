public class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int max = -1;

        for (int i = 0; i < s.length(); i++) {
            int j = s.lastIndexOf(s.charAt(i));
            if (j > i) {
                max = Math.max(max, j - i - 1);
            }
        }

        return max;
    }
}