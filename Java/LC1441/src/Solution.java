import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> ans = new LinkedList<>();

        for (int i = 0; i < target.length; i++) {
            if (i + 1 == target[i]) {
                ans.add("Push");
            } else {
                for (int j = 0; j < target[i] - (i - 1 >= 0 ? target[i - 1] : 0) - 1; j++) {
                    ans.add("Push");
                    ans.add("Pop");
                }
                ans.add("Push");
            }
        }

        return ans;
    }
}
