public class App {
    public static void main(String[] args) {
        Solution solution = new Solution();

        ListNode list1 = new ListNode(10, new ListNode(1, new ListNode(13, new ListNode(6, new ListNode(9, new ListNode(5))))));
        ListNode list2 = new ListNode(1000000, new ListNode(1000001, new ListNode(1000002)));

        ListNode ans = solution.mergeInBetween(list1, 3, 4, list2);
        while (ans != null) {
            System.out.println(ans.val);
            ans = ans.next;
        }
    }
}
