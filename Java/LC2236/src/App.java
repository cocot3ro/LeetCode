public class App {
    public static void main(String[] args) {
        Solution solution = new Solution();

        TreeNode root = new TreeNode(10, new TreeNode(4), new TreeNode(6));

        System.out.println(solution.checkTree(root));
    }
}
