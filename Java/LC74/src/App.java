public class App {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };
        int target = 3;

        System.out.println(solution.searchMatrix(matrix, target));
    }
}
