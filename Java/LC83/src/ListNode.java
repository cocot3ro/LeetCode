public class ListNode {
    int val;
    ListNode next;
    ListNode() {
        this(0);
    }
    ListNode(int val) {
        this(val, null);
    }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
