import java.util.Stack;

public class MyQueue {
    private Stack<Integer> stack;

    public MyQueue() {
        stack = new Stack<>();
    }

    public void push(int x) {
        Stack<Integer> tmp = new Stack<>();
        tmp.add(x);
        tmp.addAll(stack);
        stack = tmp;
    }

    public int pop() {
        return stack.pop();
    }

    public int peek() {
        return stack.peek();
    }

    public boolean empty() {
        return stack.isEmpty();
    }
}