package solutions;

import java.util.LinkedList;
import java.util.List;

/**
 *  Problem : https://www.acmicpc.net/problem/1967
 *  Date    : 2020-02-18
 *  Dankook UNIV.
 *  Computer Science
 *  Oh Donggeon
 *  desc : 정점과 정점 사이의 거리가 가장 먼 거리를 구하여라.
 */
public class Problem1967 {

    private List<List<MyNode>> nodes;
    private boolean[] visited;
    private int nodesSize = 0;
    private int length = 0;

    private int answer = 0;

    public Problem1967(int size, int[][] input) {

        this.nodes = new LinkedList<>();
        this.visited = new boolean[size];
        this.nodesSize = size;

        init(input);
    }

    public void printSolution() {

        getFarthestNode(0);
        System.out.println(answer);
    }

    private void getFarthestNode(int outerIndex) {

        if(visited[outerIndex]) {
            System.out.println(outerIndex + " is visited");
            return;
        }

        visited[outerIndex] = true;
        for(int innerIndex = 0; innerIndex < nodes.get(outerIndex).size(); innerIndex++) {

            MyNode node = nodes.get(outerIndex).get(innerIndex);
            length += node.getEdge();

            System.out.println("node " + outerIndex + " to " + node.getVertex() + " length : " + length);
            getFarthestNode(node.getVertex());
            length -= node.getEdge();

            if(answer < length) {
                answer = length;
            }
        }
    }

    private void init(int[][] input) {

        for(int[] node : input) {
            if(node[0] > nodes.size()) {
                nodes.add(new LinkedList<>());
            }
            nodes.get(node[0] - 1).add(new MyNode(node[1] - 1, node[2]));
        }

        for(int[] node : input) {
            if(node[1] > nodes.size()) {
                nodes.add(new LinkedList<>());
            }
            nodes.get(node[1] - 1).add(new MyNode(node[0] - 1, node[2]));
        }

        for(int i = 0; i < nodes.size(); i++) {
            System.out.println("node" + i);
            for(int j = 0; j < nodes.get(i).size(); j++) {
                System.out.println("vertex : " + nodes.get(i).get(j).getVertex() + " edge : " + nodes.get(i).get(j).getEdge());
            }
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