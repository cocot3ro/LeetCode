import java.util.Arrays;

public class Solution {
    public int heightChecker(int[] heights) {
        int ans = 0;

        int[] copy = new int[heights.length];

        System.arraycopy(heights, 0, copy, 0, heights.length);
        Arrays.sort(copy);

        for (int i = 0; i < copy.length; i++) {
            if (heights[i] != copy[i]) {
                ans++;
            }
        }

        return ans;
    }
}