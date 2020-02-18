package solutions;

import java.util.LinkedList;
import java.util.List;

public class Problem1967 {

    private List<List<MyNode>> nodes;
    private int size;
    private boolean[] visited;

    public Problem1967(int size, int[][] input) {

        this.nodes = new LinkedList<>();
        this.size = size;
        this.visited = new boolean[size];

        init(input);
    }

    public int printSolution() {

        getFarthestNode(0);

        return 0;
    }

    private void getFarthestNode(int vIndex) {

        if(visited[vIndex]) {
            return;
        }
    }

    private void init(int[][] input) {

        for(int[] node : input) {
            if(node[0] >= nodes.size()) {
                nodes.add(new LinkedList<>());
            }
            nodes.get(node[0] - 1).add(new MyNode(node[1], node[2]));
        }

        for(int[] node : input) {
            if(node[1] >= nodes.size()) {
                nodes.add(new LinkedList<>());
            }
            nodes.get(node[1] - 1).add(new MyNode(node[0], node[2]));
        }
    }
}

class MyNode {

    private int vertex;
    private int edge;

    public MyNode(int vertex, int edge) {
        this.vertex = vertex;
        this.edge = edge;
    }

    public int getVertex() {
        return vertex;
    }

    public int getEdge() {
        return edge;
    }
}