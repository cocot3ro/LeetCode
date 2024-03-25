import java.util.*;

public class Graph {

    class Node {
        int val;
        boolean explored;
        Map<Node, Integer> next;
        int minorTime;

        Node(int val) {
            this.val = val;
            this.explored = false;
            this.next = new HashMap<>();
            this.minorTime = Integer.MAX_VALUE;
        }

        void addNext(int n, int time) {
            next.put(singleton.getInstance(n), time);
        }

        void reset() {
            explored = false;
            minorTime = Integer.MAX_VALUE;
        }

        @Override
        public String toString() {
            return val + "";
        }
    }

    class Singleton {
        Map<Integer, Node> singleton;

        Singleton(int initialCapacity) {
            this.singleton = new HashMap<>(initialCapacity);
        }

        Node getInstance(int nodeVal) {
            if (!singleton.containsKey(nodeVal)) {
                singleton.put(nodeVal, new Node(nodeVal));
            }
            return singleton.get(nodeVal);
        }

        void reset() {
            singleton.values().forEach(Node::reset);
        }
    }

    private final Singleton singleton;

    public Graph(int initialCapacity, int[][] edges) {
        this.singleton = new Singleton(initialCapacity);
        for (int[] edge : edges) {
            addEdge(edge);
        }
    }

    public void addEdge(int[] edge) {
        Node node = singleton.getInstance(edge[0]);
        node.addNext(edge[1], edge[2]);
    }

    public int shortestPath(int node1, int node2) {
        singleton.reset();
        singleton.getInstance(node1).minorTime = 0;

        if (!isReachable(node1, node2)) {
            return -1;
        }

        return recursive(node1, node2);
    }

    private boolean isReachable(int node1, int node2) {
        if (node1 == node2) {
            return true;
        }

        for (Map.Entry<Node, Integer> entry : singleton.getInstance(node1).next.entrySet()) {
            if (isReachable(entry.getKey().val, node2)) {
                return true;
            }
        }

        return false;
    }

    private int recursive(int node1, int node2) {
        if (node1 == node2) {
            return singleton.getInstance(node2).minorTime;
        }

        Node thisNode = singleton.getInstance(node1);
        thisNode.explored = true;
        int minorTime = Integer.MAX_VALUE;
        Node minorNode = null;
        for (Map.Entry<Node, Integer> entry : thisNode.next.entrySet()) {
            Node nextNode = entry.getKey();
            if (!nextNode.explored) {
                nextNode.minorTime = Math.min(nextNode.minorTime, thisNode.minorTime + entry.getValue());
                if (nextNode.minorTime < minorTime) {
                    minorTime = nextNode.minorTime;
                    minorNode = nextNode;
                }
            }
        }

        return recursive(minorNode.val, node2);
    }
}
