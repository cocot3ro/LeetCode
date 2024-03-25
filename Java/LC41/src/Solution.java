import java.util.*;

public class Solution {
    public int firstMissingPositive(int[] nums) {

        Arrays.sort(nums);

        Set<Integer> set = new TreeSet<>();

        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] < 1) {
                break;
            }
            set.add(nums[i]);
        }

        int expected = 1;
        for (Integer i : set) {
            if (i != expected) {
                return expected;
            } else {
                expected++;
            }
        }

        return expected;
    }
}
