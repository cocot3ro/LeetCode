public class App {
    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();

        int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };

        System.out.println(solution.spiralOrder(matrix));
    }
}
