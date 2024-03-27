import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();

        int m = 3;
        int n = 5;
        int[] headList = { 3, 0, 2, 6, 8, 1, 7, 9, 4, 2, 5, 5, 0 };

        ListNode head = new ListNode(headList[0]);
        ListNode tmp = head;
        for (int i = 1; i < headList.length; i++) {
            tmp.next = new ListNode(headList[i]);
            tmp = tmp.next;
        }

        int[][] ans = solution.spiralMatrix(m, n, head);
        for (int[] vector : ans) {
            System.out.println(Arrays.toString(vector));
        }
    }
}
