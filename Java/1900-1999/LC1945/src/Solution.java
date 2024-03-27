public class Solution {
    public int getLucky(String s, int k) {

        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            sb.append(c - 'a' + 1);
        }

        for (int i = 0; i < k; i++) {
            int sum = 0;
            for (int j = 0; j < sb.length(); j++) {
                sum += sb.charAt(j) - '0';
            }
            sb = new StringBuilder();
            sb.append(sum);
        }

        return Integer.parseInt(sb.toString());
    }
}
