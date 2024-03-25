public class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder sb = new StringBuilder();

        boolean b = true;
        for (int i = 0; i < s.length(); i += k, b = !b) {
            int end = Math.min(i + k, s.length());
            if (b) {
                sb.append(reverseString(s.substring(i, end)));
            } else {
                sb.append(s, i, end);
            }
        }

        return sb.toString();
    }

    private String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}
