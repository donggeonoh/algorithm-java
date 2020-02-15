package solutions;

public class Problem1967 {

    RootNode rootNode;

    public int solution(int[][] input) {
        rootNode = new RootNode(input);
        return 45;
    }
}

class RootNode {

    int size;

    private Node left;
    private Node right;

    RootNode(int[][] input) {
        size = input.length;
        init(input);
    }

    private void init(int[][] input) {

        Node node;
        int count = 1;

        for (int i = 0; i < input.length; i++) {
            if(count == input[i][0]) {
                node = newNode(input[i][0], input[i][1], input[i][2]);
            }
            else {
                count++;

            }
        }
    }

    private Node newNode(int depth, int vertex, int edge) {

        if(left == null) {
            left = new Node(depth, vertex, edge);
            return left;
        } else {
            right = new Node(depth, vertex, edge);
            return right;
        }
    }

}

class Node {

    private int depth;

    private int vertex;
    private int edge;

    private Node left;
    private Node right;

    public Node(int depth, int vertex, int edge) {
        this.depth = depth;
        this.vertex = vertex;
        this.edge = edge;
    }

    public int getDepth() {
        return depth;
    }

    public int getVertex() {
        return vertex;
    }

    public int getEdge() {
        return edge;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }
}