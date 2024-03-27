public class Solution {
    public boolean isHappy(int n) {
        StringBuilder sb = new StringBuilder().append(n);

        while (sb.length() > 1) {
            int sos = 0;
            for (int i = 0; i < sb.length(); i++) {
                sos += Math.pow(sb.charAt(i) - '0', 2);
            }
            sb = new StringBuilder().append(sos);
        }

        String s = sb.toString();

        return s.equals("1") || s.equals("7");
    }
}