import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Solution solution = new Solution();

        List<List<Integer>> nums = List.of(List.of(1, 2, 3, 4, 5, 6));

        System.out.println(Arrays.toString(solution.findDiagonalOrder(nums)));


    }
}
