public class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null || root.left == null && root.right == null) {
            return 0;
        }
        return left(root);
    }

    private int left(TreeNode node) {

        if (node == null) {
            return 0;
        }

        if (node.left == null && node.right == null) {
            return node.val;
        }

        return left(node.left) + right(node.right);
    }

    private int right(TreeNode node) {
        if (node == null) {
            return 0;
        }

        return left(node.left) + right(node.right);
    }
}
