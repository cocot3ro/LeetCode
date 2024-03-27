public class Solution {

    public int[] applyOperations(int[] nums) {

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                nums[i] *= 2;
                nums[i + 1] = 0;
            }
        }

        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
        }

        int j = 0;
        for (int i = 0; i < ans.length; i++) {
            if (ans[i] != 0) {
                nums[j++] = ans[i];
            }
        }

        for (int i = j; i < nums.length; i++) {
            nums[i] = 0;
        }

        return nums;
    }
}
