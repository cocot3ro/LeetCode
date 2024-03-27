public class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode ans = null;
        ListNode tmp = head;
        while (tmp != null) {
            ans = new ListNode(tmp.val, ans);
            tmp = tmp.next;
        }

        return ans;
    }
}
