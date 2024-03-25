public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;
        ListNode ans = new ListNode(head.val);
        ListNode tmp = ans;
        while (head.next != null) {
            head = head.next;
            if (tmp.val != head.val) {
                tmp.next = new ListNode(head.val);
                tmp = tmp.next;
            }
        }
        return ans;
    }
}
