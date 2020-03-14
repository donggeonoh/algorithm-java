package solutions;

import java.util.LinkedList;
import java.util.List;

/**
 *  Problem : https://www.acmicpc.net/problem/1967
 *  Date    : 2020-02-18
 *  Dankook UNIV.
 *  Computer Science
 *  Oh Donggeon
 *  desc : 정점과 정점 사이 가장 먼 거리를 출력 하여라.
 */
public class DiameterOfTheTree2 {

    private final List<List<MyNode>> nodes;
    private final int nodesSize;

    private int farthestNode = 0;
    private int answer = 0;

    private boolean[] visited;
    private int length;


    public DiameterOfTheTree2(int size, int[][] input) {

        this.nodes = new LinkedList<>();
        this.nodesSize = size;

        init();
        init(input);
    }

    public void printSolution() {

        getFarthestNode(2);
        init();
        getFarthestNode(farthestNode);
        System.out.println(answer);
    }

    private void getFarthestNode(int outerIndex) {

        if(visited[outerIndex]) {
            return;
        }
        visited[outerIndex] = true;

        for(int innerIndex = 0; innerIndex < nodes.get(outerIndex).size(); innerIndex++) {

            MyNode node = nodes.get(outerIndex).get(innerIndex);
            length += node.getEdge();
            getFarthestNode(node.getVertex());
            length -= node.getEdge();

            if(answer < length) {
                farthestNode = outerIndex;
                answer = length;
            }
        }
    }

    private void init() {
        visited = new boolean[nodesSize];
        length = 0;
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
    }
}