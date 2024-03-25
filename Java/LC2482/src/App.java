import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[][] grid = new int[][] { { 0, 1, 1 }, { 1, 0, 1 }, { 0, 0, 1 } };

        int[][] result = solution.onesMinusZeros(grid);

        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }

    }
}
