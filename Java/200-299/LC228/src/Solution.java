import java.util.LinkedList;
import java.util.List;

public class Solution {
    
    public List<String> summaryRanges(int[] nums) {
        List<String> ans = new LinkedList<>();

        for (int i = 0; i < nums.length; i++) {
            String add = nums[i] + "";

            int count = 0;
            while (i < nums.length - 1 && nums[i] + 1 == nums[i + 1]) {
                count++;
                i++;
            }

            if (count > 0) {
                add += "->" + nums[i];
            }

            ans.add(add);
        }

        return ans;
    }
}
