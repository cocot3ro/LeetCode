import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MyStack {
    private Queue<Integer> queue;

    public MyStack() {
        queue = new LinkedList<>();
    }

    public void push(int x) {
        Queue<Integer> tmp = new LinkedList<>(List.of(x));
        tmp.addAll(queue);
        queue = tmp;
    }

    public int pop() {
        return queue.poll();
    }

    public int top() {
        return queue.peek();
    }

    public boolean empty() {
        return queue.isEmpty();
    }
}