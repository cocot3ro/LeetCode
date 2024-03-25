public class App {
    public static void main(String[] args) {
        Solution solution = new Solution();

        ListNode l1 = new ListNode(3);
        ListNode l2 = new ListNode(2);
        l1.next = l2;
        ListNode l3 = new ListNode(0);
        l2.next = l3;
        ListNode l4 = new ListNode(-4);
        l3.next = l4;
        l4.next = l2;

        System.out.println(solution.hasCycle(l1));
    }
}
