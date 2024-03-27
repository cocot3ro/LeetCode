public class Solution {
    int nodeCont = 0;
    int sum = 0;
    int ans = 0;
    public int averageOfSubtree(TreeNode root) {
        if (root == null) {
            return 0;
        }

        if (root.val == average(root)) {
            ans++;
        }

        averageOfSubtree(root.left);
        averageOfSubtree(root.right);
        return ans;
    }

    private int average(TreeNode node) {
        if (node == null) {
            return 0;
        }

        recursive(node);

        int avg = sum / nodeCont;

        nodeCont = 0;
        sum = 0;

        return avg;
    }

    private void recursive(TreeNode node) {
        if (node == null) {
            return;
        }

        sum += node.val;
        nodeCont++;

        recursive(node.left);
        recursive(node.right);
    }
}
