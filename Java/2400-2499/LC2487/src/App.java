public class App {
    public static void main(String[] args) {
        Solution solution = new Solution();

        ListNode head = new ListNode(5);
        head.next = new ListNode(2);
        head.next.next = new ListNode(13);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(8);

        ListNode result = solution.removeNodes(head);

        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
}
