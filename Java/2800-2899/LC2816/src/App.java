public class App {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        ListNode head = new ListNode(1);
        head.next = new ListNode(8);
        head.next.next = new ListNode(9);

        ListNode result = solution.doubleIt(head);
        
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
}
