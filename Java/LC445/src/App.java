public class App {
    public static void main(String[] args) {
        Solution solution = new Solution();

        ListNode l1 = new ListNode(7, new ListNode(2, new ListNode(4, new ListNode(3))));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        System.out.println(solution.addTwoNumbers(l1, l2));
    }
}
