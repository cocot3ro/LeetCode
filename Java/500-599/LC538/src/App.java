public class App {

    public static void main(String[] args) {
        Solution solution = new Solution();

        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(1);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(7);
        root.left.right.right = new TreeNode(3);
        root.right.right.right = new TreeNode(8);

        root = solution.convertBST(root);

        System.out.println(root.val); // 30
        System.out.println(root.left.val); // 36
        System.out.println(root.right.val); // 21
        System.out.println(root.left.left.val); // 36
        System.out.println(root.left.right.val); // 35
        System.out.println(root.right.left.val); // 26
        System.out.println(root.right.right.val); // 15
        System.out.println(root.left.right.right.val); // 33
        System.out.println(root.right.right.right.val); // 8
    }
}
