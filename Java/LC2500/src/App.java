public class App {
    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();

        int[][] grid = { { 1, 2, 4 }, { 3, 3, 1 } };

        System.out.println(solution.deleteGreatestValue(grid));
    }
}
