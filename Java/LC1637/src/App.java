public class App {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[][] points = new int[][]{{8, 7}, {9, 9}, {7, 4}, {9, 7}};

        System.out.println(solution.maxWidthOfVerticalArea(points));
    }
}
