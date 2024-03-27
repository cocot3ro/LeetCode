import java.util.LinkedList;
import java.util.List;

public class Solution {
    List<Integer> ans = new LinkedList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        inorder(root);
        return ans;
    }

    private void inorder(TreeNode node) {
        if (node == null) {
            return;
        }

        inorder(node.left);
        ans.add(node.val);
        inorder(node.right);
    }
}
