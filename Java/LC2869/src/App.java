import java.util.List;

public class App {
    public static void main(String[] args) {
        Solution solution = new Solution();

        List<Integer> nums = List.of(3, 2, 5, 3, 1);
        int k = 3;

        System.out.println(solution.minOperations(nums, k));
    }
}
