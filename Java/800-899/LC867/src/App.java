import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // matrix = [[1,2,3],[4,5,6],[7,8,9]]
        int[][] matrix = new int[][] { { 1, 2, 3 }, { 4, 5, 6 } };

        int[][] ans = solution.transpose(matrix);

        for (int[] row : ans) {
            System.out.println(Arrays.toString(row));
        }
    }
}
