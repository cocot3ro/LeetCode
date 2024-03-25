import java.util.*;

public class Solution {
    Map<Integer, Integer> map = new HashMap<>();
    public int[] findMode(TreeNode root) {

        recursive(root);

        int max = -1;
        int size = 1;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                size = 1;
            } else if (entry.getValue() == max) {
                size++;
            }
        }

        int[] ans = new int[size];

        int idx = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == max) {
                ans[idx++] = entry.getKey();
            }
        }

        return ans;
    }

    private void recursive(TreeNode node) {
        if (node == null) {
            return;
        }

        map.put(node.val, map.getOrDefault(node.val, 0) + 1);
        recursive(node.left);
        recursive(node.right);
    }
}
