import java.util.Arrays;

class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] ans = new int[nums.length];

        int idx = 0;
        for(int i : nums) {
            if (i >= pivot) continue;

            ans[idx++] = i;
        }

        int idx2 = nums.length - 1;
        for(int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] <= pivot) continue;

            ans[idx2--] = nums[i];
        }

        Arrays.fill(ans, idx, idx2 + 1, pivot);

        return ans;
    }
}