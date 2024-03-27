import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        List<Integer> list = new LinkedList<>();

        ListNode tmp = list1;
        while (tmp != null) {
            list.add(tmp.val);
            tmp = tmp.next;
        }

        tmp = list2;
        while (tmp != null) {
            list.add(tmp.val);
            tmp = tmp.next;
        }

        Collections.sort(list);

        ListNode ans = null;
        ListNode prevNode = null;
        for (Integer i : list) {
            ListNode newNode = new ListNode(i);
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
