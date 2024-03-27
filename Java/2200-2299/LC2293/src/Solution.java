public class Solution {
    public int minMaxGame(int[] nums) {
        int[] newNums = new int[nums.length / 2];

        while (nums.length > 1) {
            for (int i = 0; i < newNums.length; i++) {
                newNums[i] = i % 2 == 0 ? Math.min(nums[i * 2], nums[i * 2 + 1]) : Math.max(nums[i * 2], nums[i * 2 + 1]);
            }
            nums = newNums;
            newNums = new int[nums.length / 2];
        }

        return nums[0];
    }
}
