public class Solution {
    private int sum = 0;

    public TreeNode convertBST(TreeNode root) {
        if (root != null) {
            convertBST(root.right);

            root.val += sum;
            sum = root.val;

            convertBST(root.left);
        }

        return root;
    }
}