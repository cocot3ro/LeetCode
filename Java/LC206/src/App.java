public class App {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] headList = { 1, 2, 3, 4, 5};

        ListNode head = new ListNode(headList[0]);
        ListNode tmp = head;
        for (int i = 1; i < headList.length; i++) {
            tmp.next = new ListNode(headList[i]);
            tmp = tmp.next;
        }

        System.out.println(solution.reverseList(head));
    }
}
