public class App {
    public static void main(String[] args) {
        Solution solution = new Solution();

        TreeNode root = new TreeNode(2, new TreeNode(1), new TreeNode(3));

        System.out.println(solution.findBottomLeftValue(root));
    }
}
