public class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val; this.next = next;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder(String.valueOf(val));

        ListNode tmp = this.next;
        while (tmp != null) {
            str.append("->").append(tmp.val);
            tmp = tmp.next;
        }

        return str.toString();
    }
}
