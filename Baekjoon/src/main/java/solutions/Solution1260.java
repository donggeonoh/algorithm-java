package solutions;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by donggeon on 2020/02/23
 * Dankook UNIV. Computer Science
 * Source : https://www.acmicpc.net/problem/1260
 * Desc : 입력된 정점과 간선에서 시작 정점에서의 DFS, BFS를 차례대로 출력하여라.
 * DFS는 Stack, BFS는 Queue를 사용.
 */
public class Solution1260 {

    private final List<List<Integer>> graph;

    private final int vertexNum;
    private final int edgeNum;
    private final int startVertex;

    private final Stack<Integer> DFS = new Stack<>();
    private final Queue<Integer> BFS = new LinkedList<>();

    private boolean[] visited;

    public Solution1260(List<List<Integer>> graph, int vertexNum, int edgeNum, int startVertex) {
        this.graph = graph;
        this.vertexNum = vertexNum;
        this.edgeNum = edgeNum;
        this.startVertex = startVertex;
    }

    public void solution() {
        init();
        depthFirstSearch();
        init();
        breadthFirstSearch();
    }

    public void depthFirstSearch() {

        DFS.push(startVertex);
        visited[startVertex] = true;
        System.out.print(startVertex + " ");

        while (!DFS.isEmpty()) {
            boolean nonePushNodeFlag = true;
            for (int index = 0; index < graph.get(DFS.peek()).size(); index++) {
                int linkedNode = graph.get(DFS.peek()).get(index);
                if (!visited[linkedNode]) {
                    visited[linkedNode] = true;
                    nonePushNodeFlag = false;
                    DFS.push(linkedNode);
                    System.out.print(linkedNode + " ");
                }
            }
            if(nonePushNodeFlag) {
                DFS.pop();
            }
        }
        System.out.println();
    }

    public void breadthFirstSearch() {

        BFS.offer(startVertex);
        visited[startVertex] = true;

        while (!BFS.isEmpty()) {
            int vertex = BFS.poll();
            System.out.print(vertex + " ");

            for (int index = 0; index < graph.get(vertex).size(); index++) {
                int linkedNode = graph.get(vertex).get(index);

                if (!visited[linkedNode]) {
                    visited[linkedNode] = true;
                    BFS.offer(linkedNode);
                }
            }
        }
    }

    public void init() {
        visited = new boolean[vertexNum + 1];
    }
}