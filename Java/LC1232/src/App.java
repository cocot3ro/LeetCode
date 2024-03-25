public class App {
    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();

        int[][] coordinates = { { 1, 2 }, { 2, 3 }, { 3, 4 }, { 4, 5 }, { 5, 6 }, { 6, 7 } };

        System.out.println(solution.checkStraightLine(coordinates));
    }
}
