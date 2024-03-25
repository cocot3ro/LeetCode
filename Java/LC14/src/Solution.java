public class Solution {
    public String longestCommonPrefix(String[] strs) {
        int i;
        outer:
        for (i = 1; i <= strs[0].length(); i++) {
            String prefix = strs[0].substring(0, i);
            for (String s : strs) {
                if (!s.startsWith(prefix)) {
                    break outer;
                }
            }
        }

        return strs[0].substring(0, --i);
    }
}
