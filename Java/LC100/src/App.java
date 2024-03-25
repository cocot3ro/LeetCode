public class App {
    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();

        int[] pList = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
        int[] qList = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };

        TreeNode p = buildTree(pList, 0, pList.length - 1);
        TreeNode q = buildTree(qList, 0, qList.length - 1);

        System.out.println(solution.isSameTree(p, q));

    }

    public static TreeNode buildTree(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }

        int mid = (start + end) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = buildTree(nums, start, mid - 1);
        root.right = buildTree(nums, mid + 1, end);
        return root;
    }

    public static void printTree(TreeNode node, String prefix) {
        if (node == null) {
            return;
        }

        System.out.println(prefix + node.val);
        printTree(node.left, prefix + "\t");
        printTree(node.right, prefix + "\t");
    }
}
