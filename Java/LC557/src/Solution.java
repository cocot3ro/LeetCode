public class Solution {
    public String reverseWords(String s) {
        int currSpace = 0;
        int nextSpace = s.indexOf(" ");
        StringBuilder sb = new StringBuilder();

        while (nextSpace != -1) {
            sb.append(reverse(s.substring(currSpace, nextSpace)));
            sb.append(" ");

            currSpace = nextSpace + 1;
            nextSpace = s.indexOf(" ", currSpace);
        }

        sb.append(reverse(s.substring(currSpace)));

        return sb.toString();
    }

    private StringBuilder reverse(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = s.length(); i > 0; i--) {
            sb.append(s.charAt(i - 1));
        }

        return sb;
    }
}