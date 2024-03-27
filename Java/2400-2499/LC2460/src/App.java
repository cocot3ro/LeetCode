import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();

        int[] nums = { 1, 2, 2, 1, 1, 0 };

        System.out.println(Arrays.toString(solution.applyOperations(nums)));
    }
}
