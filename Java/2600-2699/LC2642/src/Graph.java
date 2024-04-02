class Graph {
    private final int[][] graph;
    private final int n;
    private final int m;
    private final int[][] dist;
    private final int INF = 1_000_000_000;

    public Graph(int n, int[][] edges) {
        this.n = n;
        this.m = edges.length;
        this.graph = new int[n][n];
        this.dist = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                this.graph[i][j] = INF;
                this.dist[i][j] = INF;
            }
        }
        for (int i = 0; i < n; i++) {
            this.graph[i][i] = 0;
            this.dist[i][i] = 0;
        }
        for (int i = 0; i < m; i++) {
            int[] edge = edges[i];
            this.graph[edge[0]][edge[1]] = edge[2];
            this.dist[edge[0]][edge[1]] = edge[2];
        }
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    this.dist[i][j] = Math.min(this.dist[i][j], this.dist[i][k] + this.dist[k][j]);
                }
            }
        }
    }

    public int shortestPath(int start, int end) {
        return this.dist[start][end] == INF ? -1 : this.dist[start][end];
    }

    public void addEdge(int[] edge) {
        this.graph[edge[0]][edge[1]] = edge[2];
        this.dist[edge[0]][edge[1]] = edge[2];
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    this.dist[i][j] = Math.min(this.dist[i][j], this.dist[i][k] + this.dist[k][j]);
                }
            }
        }
    }
}