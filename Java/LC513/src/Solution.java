public class Solution {
    private int ans;
    private int maxLevel = -1;

    public int findBottomLeftValue(TreeNode root) {
        recursive(root, 0);
        return ans;
    }

    private void recursive(TreeNode node, int level) {
        if (node == null) return;

        if (level > maxLevel) {
            ans = node.val;
            maxLevel = level;
        }

        recursive(node.left, level + 1);
        recursive(node.right, level + 1);
    }
}