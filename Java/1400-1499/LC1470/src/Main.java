import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums = {1, 2, 3, 4, 4, 3, 2, 1};

        System.out.println(Arrays.toString(solution.shuffle(nums, 4)));
    }
}