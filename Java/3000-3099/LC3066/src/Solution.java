import java.util.PriorityQueue;

public class Solution {

    @SuppressWarnings("DataFlowIssue")
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<>();

        for (int n : nums) {
            if (n >= k) continue;

            q.offer(n);
        }

        int i = 0;

        while (q.size() > 1) {
            int first = q.poll();
            int sec = q.poll();

            long n = first * 2L + sec;
            i++;

            if (n >= k) continue;
            q.add((int)n);
        }

        return i + q.size();
    }

}