public class Solution {
    public int hammingWeight(int n) {
        String s = Integer.toBinaryString(n);

        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                sum++;
            }
        }

        return sum;
    }
}