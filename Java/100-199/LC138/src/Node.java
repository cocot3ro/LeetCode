import java.util.LinkedHashMap;
import java.util.Map;

public class Node {
    int val;
    Node next;
    Node random;

    Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }

    public String string() {
        Node tmp = this;
        Map<Node, Integer> map = new LinkedHashMap<>();
        int i = 0;
        while (tmp != null) {
            map.put(tmp, i++);
            tmp = tmp.next;
        }
        System.out.println(map);
        tmp = this;
        StringBuilder str = new StringBuilder("[");
        while (tmp != null) {
            System.out.println(tmp.random);
            str.append("[").append(tmp.val).append(",").append(map.get(tmp.random)).append("],");
            tmp = tmp.next;
        }

        return str.substring(0, str.length() - 1) + "]";
    }

}
