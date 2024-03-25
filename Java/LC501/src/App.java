import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Solution solution = new Solution();

        TreeNode root = new TreeNode(1, new TreeNode(0, new TreeNode(0, new TreeNode(0), null), new TreeNode(0)), new TreeNode(1, new TreeNode(1), new TreeNode(1)));

        System.out.println(Arrays.toString(solution.findMode(root)));
    }
}
