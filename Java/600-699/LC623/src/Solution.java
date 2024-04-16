public class Solution {
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if (depth == 1) {
            return new TreeNode(val, root, null);
        }
        dfs(root, val, depth, 1);
        return root;
    }

    private void dfs(TreeNode node, int val, int depth, int currentDepth) {
        if (node == null) {
            return;
        }
        
        if (currentDepth == depth - 1) {
            node.left = new TreeNode(val, node.left, null);
            node.right = new TreeNode(val, null, node.right);
            return;
        }
        
        dfs(node.left, val, depth, currentDepth + 1);
        dfs(node.right, val, depth, currentDepth + 1);
    }
}