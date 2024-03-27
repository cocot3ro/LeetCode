public class Solution {

    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] ans = new int[m][n];

        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[i].length; j++) {
                ans[i][j] = -1;
            }
        }

        int top = 0;
        int bot = ans.length;
        int left = 0;
        int rigth = ans[0].length;

        while (head != null) {
            for (int i = left; i < rigth && head != null; i++) {
                ans[top][i] = head.val;
                head = head.next;
            }
            top++;

            for (int i = top; i < bot && head != null; i++) {
                ans[i][rigth - 1] = head.val;
                head = head.next;
            }
            rigth--;

            for (int i = rigth - 1; i >= left && head != null; i--) {
                ans[bot - 1][i] = head.val;
                head = head.next;
            }
            bot--;

            for (int i = bot - 1; i >= top && head != null; i--) {
                ans[i][left] = head.val;
                head = head.next;
            }
            left++;
        }

        return ans;
    }
}