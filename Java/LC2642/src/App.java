public class App {
    public static void main(String[] args) {
        Graph graph = new Graph(4, new int[][]{{0, 2, 5}, {0, 1, 2}, {1, 2, 1}, {3, 0, 3}});

        System.out.println(graph.shortestPath(3, 2));
        System.out.println(graph.shortestPath(0, 3));
        graph.addEdge(new int[]{1, 3, 4});
        System.out.println(graph.shortestPath(0, 3));
    }
}
