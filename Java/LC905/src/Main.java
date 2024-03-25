import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums;

        nums = new int[] {3, 1, 2, 4};
        System.out.println(Arrays.toString(solution.sortArrayByParity(nums)));

        nums = new int[] {0};
        System.out.println(Arrays.toString(solution.sortArrayByParity(nums)));
    }
}