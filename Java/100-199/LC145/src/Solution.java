import java.util.LinkedList;
import java.util.List;

public class Solution {
    List<Integer> ans = new LinkedList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        postorder(root);
        return ans;
    }

    private void postorder(TreeNode node) {
        if (node == null) {
            return;
        }

        postorder(node.left);
        postorder(node.right);
        ans.add(node.val);
    }
}
