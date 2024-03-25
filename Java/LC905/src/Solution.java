public class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] ans = new int[nums.length];

        int even = 0;
        int odd = nums.length - 1;
        for (int num : nums) {
            ans[num % 2 == 0 ? even++ : odd--] = num;
        }

        return ans;
    }
}
