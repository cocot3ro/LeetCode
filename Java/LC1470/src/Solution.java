public class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[n * 2];

        for (int i = 0, j = n, k = 0; i < n && j < nums.length; i++, j++) {
            ans[k++] = nums[i];
            ans[k++] = nums[j];
        }
        
        return ans;
    }
}
