import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums = {1, 2, 1, 3, 2, 5};

        System.out.println(Arrays.toString(solution.singleNumber(nums)));
    }
}
