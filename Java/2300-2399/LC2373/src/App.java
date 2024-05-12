public class App {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[][] matrix = {
            {9, 9, 8, 1},
            {5, 6, 2, 6},
            {8, 2, 6, 4},
            {6, 2, 2, 2}
        };

        int[][] result = solution.largestLocal(matrix);

        for (int[] row : result) {
            for (int i : row) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
