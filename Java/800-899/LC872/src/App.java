public class App {
    public static void main(String[] args) {
        Solution solution = new Solution();

        TreeNode root1 = new TreeNode(3, new TreeNode(5, new TreeNode(6), new TreeNode(2, new TreeNode(7), new TreeNode(4))), new TreeNode(1, new TreeNode(9), new TreeNode(8)));
        TreeNode root2 = new TreeNode(3, new TreeNode(5, new TreeNode(6), new TreeNode(7)), new TreeNode(1, new TreeNode(4), new TreeNode(2, new TreeNode(9), new TreeNode(8))));

        System.out.println(solution.leafSimilar(root1, root2));
    }
}
