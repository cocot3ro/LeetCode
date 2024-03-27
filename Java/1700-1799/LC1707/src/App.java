import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
        int[] nums = { 0, 1, 2, 3, 4 };
        int[][] queries = { { 3, 1 }, { 1, 3 }, { 5, 6 } };
        System.out.println(Arrays.toString(solution.maximizeXor(nums, queries)));
    }
}
