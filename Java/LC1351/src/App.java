public class App {
    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();

        int[][] grid = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};

        System.out.println(solution.countNegatives(grid));
    }
}
