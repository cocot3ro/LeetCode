import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SummaryRanges {

    List<Integer> nums = new ArrayList<>();

    public void addNum(int value) {
        if (!nums.contains(value)) {
            nums.add(value);
            Collections.sort(nums);
        }
    }

    public int[][] getIntervals() {
        List<String> ans = new LinkedList<>();

        for (int i = 0; i < nums.size(); i++) {
            String add = nums.get(i) + "";

            int count = 0;
            while (i < nums.size() - 1 && nums.get(i) + 1 == nums.get(i + 1)) {
                count++;
                i++;
            }

            if (count > 0) {
                add += "->" + nums.get(i);
            }

            ans.add(add);
        }

        int[][] ans2 = new int[ans.size()][2];

        int i = 0;
        for (String s : ans) {
            String[] split = s.split("->");
            ans2[i++] = new int[] {Integer.parseInt(split[0]), Integer.parseInt(split[(split.length > 1 ? 1 : 0)])};
        }

        return ans2;
    }
}
