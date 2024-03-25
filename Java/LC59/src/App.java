import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();

        int n = 5;

        int[][] matrix = solution.generateMatrix(n);

        for (int[] vector : matrix) {
            System.out.println(Arrays.toString(vector));
        }
    }
}
