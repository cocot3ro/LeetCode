public class Solution {
    public int maxScore(String s) {
        int max = Integer.MIN_VALUE;
        for (int i = 1; i < s.length(); i++) {
            max = Math.max(max, s.substring(0, i).replace("1", "").length() + s.substring(i).replace("0", "").length());
        }

        return max;
    }
}