public class App {
    public static void main(String[] args) {
        Solution solution = new Solution();

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(2);
        root.right.left = new TreeNode(2);
        root.right.right = new TreeNode(4);

        int target = 2;

        TreeNode result = solution.removeLeafNodes(root, target);

        printTree(result, 0);
    }

    private static void printTree(TreeNode root, int level) {
        if (root == null) {
            System.out.println("\t".repeat(level) + "null");
            return;
        }

        System.out.println("\t".repeat(level++) + root.val);
        printTree(root.left, level);
        printTree(root.right, level);
    }
}
