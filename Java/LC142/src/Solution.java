import java.util.LinkedList;
import java.util.List;

public class Solution {
    public ListNode detectCycle(ListNode head) {
        List<ListNode> list = new LinkedList<>();

        while (head != null) {
            if (list.contains(head)) {
                return head;
            } else {
                list.add(head);
                head = head.next;
            }
        }

        return null;
    }
}
