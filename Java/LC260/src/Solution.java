import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int[] singleNumber(int[] nums) {
        if (nums.length == 2) {
            return nums;
        }
        int[] ans = new int[2];

        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                set.remove(num);
            }
        }

        int i = 0;
        for (int num : set) {
            ans[i++] = num;
        }

        return ans;
    }
}
