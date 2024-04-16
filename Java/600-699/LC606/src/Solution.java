public class Solution {
    public String tree2str(TreeNode root) {
        if (root == null) {
            return "";
        }

        String left = tree2str(root.left);
        String right = tree2str(root.right);

        if (left.isEmpty() && right.isEmpty()) {
            return String.valueOf(root.val);
        }

        if (right.isEmpty()) {
            return String.format("%d(%s)", root.val, left);
        }

        return String.format("%d(%s)(%s)", root.val, left, right);
    }
}
