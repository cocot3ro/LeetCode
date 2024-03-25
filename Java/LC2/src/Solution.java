public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = null;
        ListNode prevNode = null;

        boolean carry = false;

        while (l1 != null || l2 != null) {
            int sum = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + (carry ? 1 : 0);
            int val = (sum > 9 ? sum % 10 : sum);

            ListNode newNode = new ListNode(val);

            if (ans == null) {
                ans = newNode;
            } else {
                prevNode.next = newNode;
            }

            carry = sum > 9;

            prevNode = newNode;

            l1 = (l1 != null ? l1.next : null);
            l2 = (l2 != null ? l2.next : null);
        }

        if (carry) {
            prevNode.next = new ListNode(1);
        }

        return ans;
    }
}
