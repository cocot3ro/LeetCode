public class App {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[][] points = new int[][] { { 1, 1 }, { 3, 4 }, { -1, 0 } };

        System.out.println(solution.minTimeToVisitAllPoints(points));
    }
}
