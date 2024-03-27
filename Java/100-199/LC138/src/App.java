public class App {
    public static void main(String[] args) {
        Solution solution = new Solution();

        Node node1 = new Node(7);
        Node node2 = new Node(13);
        Node node3 = new Node(11);
        Node node4 = new Node(10);
        Node node5 = new Node(1);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        node2.random = node1;
        node3.random = node5;
        node4.random = node3;
        node5.random = node1;

        System.out.println(solution.copyRandomList(node1).string());

    }
}
