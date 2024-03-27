import java.util.LinkedList;
import java.util.List;

public class Solution {
    public boolean hasCycle(ListNode head) {
        List<ListNode> list = new LinkedList<>();

        while(head != null) {
            if (list.contains(head)) {
                return true;
            } else {
                list.add(head);
                head = head.next;
            }
        }

        return false;
    }
}
