public class App {
    public static void main(String[] args) {
        Solution solution = new Solution();

        TreeNode root = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));

        System.out.println(solution.maxDepth(root));
    }
}
