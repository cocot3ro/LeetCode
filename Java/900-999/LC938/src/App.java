public class App {
    public static void main(String[] args) {
        Solution solution = new Solution();

        TreeNode root = new TreeNode(10);
        TreeNode left = new TreeNode(5);
        TreeNode right = new TreeNode(15);
        TreeNode leftLeft = new TreeNode(3);
        TreeNode leftRight = new TreeNode(7);
        TreeNode rightRight = new TreeNode(18);

        root.left = left;
        root.right = right;
        left.left = leftLeft;
        left.right = leftRight;
        right.right = rightRight;

        int low = 7;
        int high = 15;

        System.out.println(solution.rangeSumBST(root, low, high));
    }
}
