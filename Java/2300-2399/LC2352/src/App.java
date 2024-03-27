public class App {
    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();

        int[][] grid = { { 3, 2, 1 }, { 1, 7, 6 }, { 2, 7, 7 } };

        System.out.println(solution.equalPairs(grid));
    }
}
