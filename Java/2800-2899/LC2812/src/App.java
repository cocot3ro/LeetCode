import java.util.List;

public class App {
    public static void main(String[] args) {
        Solution solution = new Solution();

        List<List<Integer>> grid = List.of(
            List.of(1, 0, 0),
            List.of(0, 0, 0),
            List.of(0, 0, 1)
        );
        
        System.out.println(solution.maximumSafenessFactor(grid));
    }
}
