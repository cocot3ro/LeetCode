public class Solution {
    public int countNicePairs(int[] nums) {
        long ans = 0;
        int[] reversed = new int[nums.length];

        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = rev(nums[i]);
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + reversed[j] == reversed[i] + nums[j]) {
                    ans++;
                }
            }
        }

        return (int) (ans % 1000000007);
    }

    private int rev(int n) {
        int reversedNumber = 0;

        while (n != 0) {
            int digit = n % 10;
            reversedNumber = reversedNumber * 10 + digit;
            n /= 10;
        }

        return reversedNumber;
    }
}