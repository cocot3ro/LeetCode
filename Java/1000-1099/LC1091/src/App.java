public class App {
    public static void main(String[] args) throws Exception {
        Solution solucion = new Solution();

        int[][] grid = { { 0, 0, 0 }, { 1, 1, 0 }, { 1, 1, 0 } };

        System.out.println(solucion.shortestPathBinaryMatrix(grid));
    }
}
