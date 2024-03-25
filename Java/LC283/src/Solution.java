public class Solution {
    public void moveZeroes(int[] nums) {
        int[] ans = new int[nums.length];

        for (int i = 0, j = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                ans[j++] = nums[i];
            }
        }

        System.arraycopy(ans, 0, nums, 0, nums.length);
    }
}
