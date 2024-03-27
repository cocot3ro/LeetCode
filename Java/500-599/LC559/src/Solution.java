public class Solution {
    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }

        int ans = 1;

        int lastNode = 0;
        for (Node node : root.children) {
            int currNode = maxDepth(node);
            if (currNode > lastNode) {
                lastNode = currNode;
            }
        }

        return ans + lastNode;
    }
}
