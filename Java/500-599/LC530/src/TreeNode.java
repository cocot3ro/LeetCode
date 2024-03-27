public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
        this(0, null, null);
    }

    TreeNode(int val) {
        this(val, null, null);
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
