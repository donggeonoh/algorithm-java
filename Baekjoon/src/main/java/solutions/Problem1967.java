package solutions;

import java.util.LinkedList;
import java.util.List;

public class Problem1967 {

    List<List<MyNode>> nodes;

    MyNode farthestNode;
    int farthestLength = 0;

    int num;
    int answer;

    public int solution(int num, int[][] input) {

        this.nodes = new LinkedList<>();
        this.num = num;

        init(input);

        MyNode node = getNodeWithFarthestDistance(nodes.get(0).get(0), 0);
        MyNode nextNode = getNodeWithFarthestDistance(node, 0);

        return answer;
    }

    private MyNode getNodeWithFarthestDistance(MyNode node, int length) {

        if(nextNode() == null) {
            return null;
        }

        if(length > farthestLength) {
            farthestNode = node;
            farthestLength = length;
            return farthestNode;
        }

        length += node.getEdge();

        return null;
    }

    private MyNode nextNode() {
        return null;
    }


    private void init(int[][] input) {

        for (int i = 0; i < num; i++) {
            if (input[i][0] > nodes.size()) {
                nodes.add(new LinkedList<>());
            }
            nodes.get(input[i][0] - 1).add(new MyNode(input[i][0], input[i][1], input[i][2]));
        }
    }
}

class MyNode {

    private int depth;
    private int vertex;
    private int edge;

    public MyNode(int depth, int vertex, int edge) {
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

    @Override
    public String toString() {
        return "MyNode{" +
                "depth=" + depth +
                ", vertex=" + vertex +
                ", edge=" + edge +
                '}';
    }
}

/*
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

                count++;
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
*/
