public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[][] mat = {{0, 1}, {1, 0}};
        int[][] target = {{1, 0}, {0, 1}};

        System.out.println(solution.findRotation(mat, target));
    }
}