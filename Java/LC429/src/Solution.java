import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> levelOrder(Node root) {
        ans.add(List.of(root.val));

        List<Integer> sublist = new LinkedList<>();
        for (Node children : root.children) {
            sublist.add(children.val);
        }
        ans.add(sublist);

        return ans;
    }

    private void handler(Node node, int index) {

    }
}
