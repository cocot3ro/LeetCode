import java.util.Arrays;

public class Solution {

    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] ans = new int[m][n];

        for (int[] arr : ans) {
            Arrays.fill(arr, -1);
        }

        int top = 0;
        int bot = ans.length;
        int left = 0;
        int right = ans[0].length;

        while (head != null) {
            for (int i = left; i < right && head != null; i++) {
                ans[top][i] = head.val;
                head = head.next;
            }
            top++;

            for (int i = top; i < bot && head != null; i++) {
                ans[i][right - 1] = head.val;
                head = head.next;
            }
            right--;

            for (int i = right - 1; i >= left && head != null; i--) {
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