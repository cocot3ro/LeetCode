import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[][] mat = {{1, 1, 0, 0, 0}, {1, 1, 1, 1, 0}, {1, 0, 0, 0, 0}, {1, 1, 0, 0, 0}, {1, 1, 1, 1, 1}};
        int k = 3;

        System.out.println(Arrays.toString(solution.kWeakestRows(mat, k)));
    }
}
