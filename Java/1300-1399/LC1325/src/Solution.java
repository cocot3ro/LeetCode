class Solution {
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        return removeLeafNodes(root, target, null);
    }

    private TreeNode removeLeafNodes(TreeNode root, int target, TreeNode parent) {
        if (root == null) {
            return null;
        }

        root.left = removeLeafNodes(root.left, target, root);
        root.right = removeLeafNodes(root.right, target, root);

        if (root.left == null && root.right == null && root.val == target) {
            if (parent != null) {
                if (parent.left == root) {
                    parent.left = null;
                } else {
                    parent.right = null;
                }
            }

            return null;
        }

        return root;
    }
}