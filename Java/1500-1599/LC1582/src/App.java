public class App {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[][] mat = new int[][] { { 1, 0, 0 }, { 0, 0, 1 }, { 1, 0, 0 } };

        System.out.println(solution.numSpecial(mat));
    }
}
