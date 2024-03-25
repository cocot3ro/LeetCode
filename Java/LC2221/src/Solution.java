import java.util.Arrays;

public class Solution {
    public int triangularSum(int[] nums) {

        if (nums.length == 1) {
            return nums[0];
        }

        int[] sublist = new int[nums.length - 1];

        while (sublist.length > 1) {
            for (int i = 0; i < sublist.length; i++) {
                int sum = nums[i] + nums[i + 1];
                sublist[i] = (sum > 9 ? sum % 10 : sum);
            }
            nums = sublist;
            sublist = new int[nums.length - 1];
        }

        int ans = nums[0] + nums[1];

        return (ans > 9 ? ans % 10 : ans);
    }
}
