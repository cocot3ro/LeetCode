import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(List.of(1));
        for (int i = 2; i <= numRows; i++) {
            List<Integer> subLevel = new ArrayList<>();
            subLevel.add(1);
            for (int j = 1; j < i - 1; j++) {
                List<Integer> sublist = ans.get(i - 2);
                subLevel.add(sublist.get(j - 1) + sublist.get(j));
            }
            subLevel.add(1);
            ans.add(subLevel);
        }
        return ans;
    }
}
