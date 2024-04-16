public class App {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        TreeNode root = new TreeNode(4, new TreeNode(2, new TreeNode(3), new TreeNode(1)), new TreeNode(6, new TreeNode(5), null));
        int val = 1;
        int depth = 2;
        
        solution.addOneRow(root, val, depth);

        System.out.println(root);
    }
}
