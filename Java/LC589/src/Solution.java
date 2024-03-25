import java.util.LinkedList;
import java.util.List;

public class Solution {
    List<Integer> ans = new LinkedList<>();
    public List<Integer> preorder(Node root) {
        pre(root);
        return ans;
    }

    private void pre(Node node) {
        if (node == null) {
            return;
        }

        ans.add(node.val);
        for (Node children : node.children) {
            pre(children);
        }
    }
}
