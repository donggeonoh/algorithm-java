package solutions;

import java.util.*;

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
        ArrayList<Integer>[] list = new ArrayList[10];

        for(int i = 0; i < 10; i++) {
            list[i] = new ArrayList<>();
        }
        init();
        depthFirstSearch(startVertex);
        init();
        breadthFirstSearch();
    }

    public void depthFirstSearch(int vertex) {
        visited[vertex] = true;

        for (int index = 0; index < graph.get(vertex).size(); index++) {
            int linkedNode = graph.get(vertex).get(index);
            if (!visited[linkedNode]) {
                depthFirstSearch(linkedNode);
            }
        }

        DFS.push(vertex);
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