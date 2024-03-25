public class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        ListNode tmp = this.next;
        StringBuilder str = new StringBuilder();
        str.append(this.val);
        while (tmp != null) {
            str.append("->").append(tmp.val);
            tmp = tmp.next;
        }

        return str.toString();
    }
}
