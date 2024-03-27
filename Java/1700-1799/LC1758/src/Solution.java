public class Solution {
    public int minOperations(String s) {
        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                if (s.charAt(i) == '1') {
                    count1++;
                } else {
                    count2++;
                }
            } else {
                if (s.charAt(i) == '1') {
                    count2++;
                } else {
                    count1++;
                }
            }
        }

        return Math.min(count1, count2);
    }
}
