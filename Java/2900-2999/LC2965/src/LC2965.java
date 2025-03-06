import java.util.Arrays;

public class LC2965 {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[][] grid = new int[][]{
                {1, 3},
                {2, 2}
        };

        System.out.println(Arrays.toString(solution.findMissingAndRepeatedValues(grid)));
    }
}
