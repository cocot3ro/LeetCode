import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Solution {
    public int findKthLargest(int[] nums, int k) {
        Queue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());

        for (int num : nums) {
            queue.offer(num);
        }

        for (int i = 0; i < k - 1; i++) {
            queue.poll();
        }

        return queue.peek();
    }
}