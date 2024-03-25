public class Solution {
    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i] || nums[i] > target) {
                return i;
            }
        }
        return nums.length;
    }
}
