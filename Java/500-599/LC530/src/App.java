public class App {
    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();

        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        System.out.println(solution.getMinimumDifference(root));
    }
}
