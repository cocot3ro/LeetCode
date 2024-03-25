public class Solution {
    public int romanToInt(String s) {
        int[] nums = new int[s.length() + 1];
        int output = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            switch (s.charAt(i)) {
                case 'I' -> nums[i] = 1;
                case 'V' -> nums[i] = 5;
                case 'X' -> nums[i] = 10;
                case 'L' -> nums[i] = 50;
                case 'C' -> nums[i] = 100;
                case 'D' -> nums[i] = 500;
                case 'M' -> nums[i] = 1000;
            }
        }

        for (int i = 0; i < nums.length - 1; i++) {
            output += (nums[i] >= nums[i + 1] ? nums[i] : nums[i + 1] - nums[i++]);
        }

        return output;
    }
}
