public class Solution {
    public Node copyRandomList(Node head) {
        Node ans = new Node(head.val);
        Node tmp = ans;
        head = head.next;
        while (head != null) {
            tmp.next = new Node(head.val);
            tmp.random = (head.random == null ? null : new Node(head.random.val));
            head = head.next;
            tmp = tmp.next;
        }

        return ans;
    }
}
