import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Solution {
    Map<Integer, Integer> map = new LinkedHashMap<>();

    public List<Integer> largestValues(TreeNode root) {
        if (root == null) {
            return new LinkedList<>();
        }

        recursive(0, root);

        return new LinkedList<>(map.values());
    }

    private void recursive(int level, TreeNode node) {
        if (node == null) {
            return;
        }

        map.put(level, Math.max(map.getOrDefault(level, Integer.MIN_VALUE), node.val));
        recursive(level + 1, node.left);
        recursive(level + 1, node.right);
    }
}