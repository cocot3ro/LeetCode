public class App {
    public static void main(String[] args) {
        Solution solution = new Solution();

        char[][] board;
        String word;

        board = new char[][]{
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };
        word = "ABCCED";

        System.out.println(solution.exist(board, word));

        word = "SEE";
        System.out.println(solution.exist(board, word));

        word = "ABCB";
        System.out.println(solution.exist(board, word));

        board = new char[][]{
                {'a'}
        };
        word = "a";
        System.out.println(solution.exist(board, word));

        board = new char[][] {
                {'b'},
                {'a'},
                {'b'},
                {'b'},
                {'a'}
        };
        word = "baa";
        System.out.println(solution.exist(board, word));
    }
}
