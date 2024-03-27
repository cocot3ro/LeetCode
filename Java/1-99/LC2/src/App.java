public class App {
    public static void main(String[] args) {
        Solution solution = new Solution();

        ListNode l1 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))))));
        ListNode l2 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));

        System.out.println(solution.addTwoNumbers(l1, l2));
    }
}
