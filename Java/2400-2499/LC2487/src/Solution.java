class Solution {
    public ListNode removeNodes(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode nxtGreater = removeNodes(head.next);

        head.next = nxtGreater;
        if (nxtGreater == null || head.val >= nxtGreater.val) {
            return head;
        }
        return nxtGreater;
    }
}