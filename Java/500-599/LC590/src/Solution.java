import java.util.LinkedList;
import java.util.List;

public class Solution {
    List<Integer> ans = new LinkedList<>();
    public List<Integer> postorder(Node root) {
        post(root);
        return ans;
    }

    private void post(Node node) {
        if (node == null) {
            return;
        }

        for (Node children : node.children) {
            post(children);
        }
        ans.add(node.val);
    }
}
