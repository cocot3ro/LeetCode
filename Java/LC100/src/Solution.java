public class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        String pTree = toString(p).toString();
        String qTree = toString(q).toString();
        return pTree.equals(qTree);
    }

    private StringBuilder toString(TreeNode node) {
        if (node == null) {
            return new StringBuilder();
        }

        StringBuilder str = new StringBuilder();
        str.append(toString(node.left)).append(";");
        str.append(node.val).append(";");
        str.append(toString(node.right)).append(";");

        return str;
    }
}