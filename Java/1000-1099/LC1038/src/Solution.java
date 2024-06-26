public class Solution {
    public TreeNode bstToGst(TreeNode root) {
        int[] keys = new int[101];

        count(keys, root);

        apply(keys, root);

        return root;
    }

    private void count(int[] keys, TreeNode node) {
        if (node == null) return;

        for (int i = 0; i < node.val; i++) {
            keys[i] += node.val;
        }

        count(keys, node.left);
        count(keys, node.right);
    }

    private void apply(int[] keys, TreeNode node) {
        if (node == null) return;

        node.val += keys[node.val];

        apply(keys, node.left);
        apply(keys, node.right);
    }
}