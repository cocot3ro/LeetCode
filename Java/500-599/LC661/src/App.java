import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[][] img = new int[][] {
            {1, 1, 1},
            {1, 0, 1},
            {1, 1, 1}
        };

        int[][] smoothedImg = solution.imageSmoother(img);

        for (int[] row : smoothedImg) {
            System.out.println(Arrays.toString(row));
        }
    }
}
