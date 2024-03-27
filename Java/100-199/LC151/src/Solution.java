public class Solution {
    public String reverseWords(String s) {
        String[] strs = s.split(" ");
        StringBuilder sb = new StringBuilder();

        for (String str : strs) {
            if (!str.isEmpty()) {
                sb.insert(0, str + " ");
            }
        }

        return sb.toString().trim();
    }
}