public class Solution {
    public ListNode doubleIt(ListNode head) {
        int i = recursive(head);

        if (i > 0)
            return new ListNode(i, head);

        return head;
    }

    private int recursive(ListNode node) {
        if (node == null) {
            return 0;
        }

        int i = recursive(node.next);

        node.val *= 2;
        node.val += i;
        
        if (node.val >= 10) {
            node.val -= 10;
            return 1;
        }
        
        return 0;
    }
}
