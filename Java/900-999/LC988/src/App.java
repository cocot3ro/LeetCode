public class App {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(1);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(3);
        root.right.right = new TreeNode(4);
        
        System.out.println(solution.smallestFromLeaf(root));
    }
}
