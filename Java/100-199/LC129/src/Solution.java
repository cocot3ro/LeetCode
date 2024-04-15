public class Solution {
    private int ans = 0;
    
    public int sumNumbers(TreeNode root) {
        
        if (root == null) {
            return 0;
        }
        
        dfs(root, 0);
        
        return ans;
    }
    
    private void dfs(TreeNode root, int sum) {
        if (root == null) return;
        
        sum = sum * 10 + root.val;
        
        if (root.left == null && root.right == null) {
            ans += sum;
            return;
        }
        
        dfs(root.left, sum);
        
        dfs(root.right, sum);
    }
}
