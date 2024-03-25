import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();

        int rows = 1;
        int cols = 4;
        int rStart = 0;
        int cStart = 0;

        int[][] matrix = solution.spiralMatrixIII(rows, cols, rStart, cStart);

        for (int[] vector : matrix) {
            System.out.println(Arrays.toString(vector));
        }
    }
}
