public class App {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[][] matches = {{1, 3}, {2, 3}, {3, 6}, {5, 6}, {5, 7}, {4, 5}, {4, 8}, {4, 9}, {10, 4},
                {10, 9}};

        System.out.println(solution.findWinners(matches));
    }
}
