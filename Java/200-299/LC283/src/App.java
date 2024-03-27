import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();

        int[] nums = { 0, 1, 0, 3, 12 };

        solution.moveZeroes(nums);

        System.out.println(Arrays.toString(nums));
    }
}
