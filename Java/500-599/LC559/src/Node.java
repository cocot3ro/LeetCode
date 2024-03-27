import java.util.LinkedList;
import java.util.List;

public class Node {
    public int val;
    public List<Node> children;

    public Node() {
        this(0, new LinkedList<>());
    }

    public Node(int val) {
        this(val, new LinkedList<>());
    }

    public Node(int val, List<Node> children) {
        this.val = val;
        this.children = children;
    }
}