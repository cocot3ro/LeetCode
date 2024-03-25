import java.util.ArrayList;
import java.util.List;

public class Solution {
    List<Integer> nums = new ArrayList<>();

    public int getMinimumDifference(TreeNode root) {
        getNums(root);

        int minimumDifference = Integer.MAX_VALUE;
        int size = nums.size();
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                int diff = Math.abs(nums.get(i) - nums.get(j));
                if (diff < minimumDifference) {
                    minimumDifference = diff;
                }
            }
        }

        return minimumDifference;
    }

    public void getNums(TreeNode node) {
        if (node == null) {
            return;
        }

        nums.add(node.val);

        getNums(node.left);
        getNums(node.right);
    }
}
