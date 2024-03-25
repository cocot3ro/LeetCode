public class Solution {

    public boolean isPalindrome(ListNode head) {
        StringBuilder sb = new StringBuilder();
        ListNode tmp = head;
        while (tmp != null) {
            sb.append(tmp.val);
            tmp = tmp.next;
        }

        int length = sb.length();

        for (int i = 0; i < length / 2; i++) {
            if (sb.charAt(i) != sb.charAt(length - 1 - i)) {
                return false;
            }
        }

        return true;
    }
}
