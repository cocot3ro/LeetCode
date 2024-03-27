import java.util.LinkedList;
import java.util.List;

public class Solution {
    List<Integer> ans = new LinkedList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        preorder(root);
        return ans;
    }

    private void preorder(TreeNode node) {
        if (node == null) {
            return;
        }

        ans.add(node.val);
        preorder(node.left);
        preorder(node.right);
    }
}
