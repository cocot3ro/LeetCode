import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] ans = new int[2];

        Set<Integer> set = new HashSet<>();

        int n2 = grid.length * grid.length;

        int sum = (n2 * (n2 + 1)) / 2;

        for (int[] ints : grid) {
            for (int j = 0; j < grid.length; j++) {
                if (set.contains(ints[j])) {
                    ans[0] = ints[j];
                } else {
                    set.add(ints[j]);
                    sum -= ints[j];
                }
            }
        }

        ans[1] = sum;

        return ans;
    }
}
