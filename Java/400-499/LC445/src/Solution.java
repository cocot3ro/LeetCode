import java.math.BigInteger;

public class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        BigInteger list1 = new BigInteger("0");
        BigInteger list2 = new BigInteger("0");

        ListNode tmp = l1;
        while (tmp != null) {
            list1 = list1.multiply(new BigInteger("10"));
            list1 = list1.add(new BigInteger(String.valueOf(tmp.val)));
            tmp = tmp.next;
        }

        tmp = l2;
        while (tmp != null) {
            list2 = list2.multiply(new BigInteger("10"));
            list2 = list2.add(new BigInteger(String.valueOf(tmp.val)));
            tmp = tmp.next;
        }

        String str = list1.add(list2).toString();

        ListNode ans = null;
        ListNode prevNode = null;
        for (int i = 0; i < str.length(); i++) {
            int val = Integer.parseInt(String.valueOf(str.charAt(i)));
            ListNode newNode = new ListNode(val);

            if (ans == null) {
                ans = newNode;
            } else {
                prevNode.next = newNode;
            }

            prevNode = newNode;
        }

        return ans;
    }
}
