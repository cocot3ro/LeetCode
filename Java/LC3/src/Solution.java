public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }
        boolean[] chars = new boolean[255];

        int lengthOfLongestSubstring = 0;

        for (int i = 0; i < s.length(); i++) {
            char currChar = s.charAt(i);
            if (!chars[currChar]) {
                lengthOfLongestSubstring++;
                chars[currChar] = true;
            } else {
                break;
            }
        }
        return Math.max(lengthOfLongestSubstring, lengthOfLongestSubstring(s.substring(1)));
    }
}
