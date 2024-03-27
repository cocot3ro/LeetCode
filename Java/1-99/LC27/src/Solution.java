import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int removeElement(int[] nums, int val) {
        List<Integer> ans = new ArrayList<>();
        int k = 0;

        for (int num : nums) {
            if (num != val) {
                ans.add(num);
                k++;
            }
        }

        int i = 0;
        for (Integer integer : ans) {
            nums[i++] = integer;
        }

        return k;
    }
}
